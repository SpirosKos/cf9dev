package gr.aueb.cf.cf9.ch18.bankapp;

import gr.aueb.cf.cf9.ch18.bankapp.controller.AccountController;
import gr.aueb.cf.cf9.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.ch18.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.ch18.bankapp.core.exceptions.ValidationException;
import gr.aueb.cf.cf9.ch18.bankapp.dao.AccountDAOImpl;
import gr.aueb.cf.cf9.ch18.bankapp.dao.IAccountDAO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.ch18.bankapp.service.AccountServiceImpl;
import gr.aueb.cf.cf9.ch18.bankapp.service.IAccountService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {

    private final static IAccountDAO accountDAO = new AccountDAOImpl();
    private final static IAccountService accountService = new AccountServiceImpl(accountDAO);
    private final static AccountController accountController = new AccountController(accountService);
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String option;
        String iban;

        while (true) {
            printMenu();
            option = scanner.nextLine();
            try {
                switch (option) {
                    case "1" -> {
                        System.out.print("Insert iban: ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Insert balance");
                        BigDecimal balance = new BigDecimal(scanner.nextLine().trim());

                        AccountReadOnlyDTO readOnlyDTO = accountController.createNewAccount(iban,balance);
                        System.out.println("The Account has been created(updated) successfully with iban: " +
                                readOnlyDTO.iban() + " balance: " + readOnlyDTO.balance());
                    }
                    case "2" -> {
                        System.out.print("Insert iban: ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Insert amount to deposit");
                        BigDecimal depositAmount = new BigDecimal(scanner.nextLine().trim());

                        accountController.deposit(iban,depositAmount);
                        System.out.println("Deposit completed: " + depositAmount + ", New Balance: " +
                                accountController.getBalance(iban));
                    }
                    case "3" -> {
                        System.out.print("Insert iban: ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Insert amount to withdraw");
                        BigDecimal withdrawAmount = new BigDecimal(scanner.nextLine().trim());

                        accountController.withdraw(iban, withdrawAmount);
                        System.out.println("Withdraw completed: " + withdrawAmount + ", New Balance: " +
                                accountController.getBalance(iban));
                    }
                    case "4" -> {
                        System.out.print("Insert iban: ");
                        iban = scanner.nextLine().trim();

                        BigDecimal balance = accountController.getBalance(iban);
                        System.out.println("Balance: " + balance);
                    }
                    case "5" -> {
                        List<AccountReadOnlyDTO> readOnlyDTOS = accountController.getAllAccounts();

                        if (readOnlyDTOS.isEmpty()) {
                            System.out.println("Accounts not found");
                        }else {
                            readOnlyDTOS.forEach(System.out::println);
                        }
                    }
                    case "6" -> {
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Invalid option.Try again");
                }
            }catch (AccountNotFoundException e){
                System.out.println("Account not found.");
            }catch (NumberFormatException e) {
                System.out.println("Incorrect format of number.");
            }catch (ValidationException e){
                System.out.println("Verification error" + e.getMessage());
            }catch (InsufficientBalanceException e) {
                System.out.println("Insufficient Balance.");
            }
        }
    }

    private static void printMenu(){
        System.out.println("\n=== Bank App Service ===");
        System.out.println("1. Create or Update account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Ask for Balance");
        System.out.println("5. Print Account(s)");
        System.out.println("6. Exit");
        System.out.println("Insert an option");
    }

}
