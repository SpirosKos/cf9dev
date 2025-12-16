package gr.aueb.cf.cf9.ch12;

public class Main {
    public static void main(String[] args) {
        Account spirAccount = new Account(1L, "GR123", "Spir", "Ks", "A123", 100) ;
        try {
            spirAccount.deposit(500);
            System.out.println(spirAccount.accountToString());

            spirAccount.withdraw(100, "A123");
            System.out.println(spirAccount.accountToString());

            spirAccount.withdraw(100, "A345");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
