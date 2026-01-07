package gr.aueb.cf.cf9.ch18.bankapp.dao;

import gr.aueb.cf.cf9.ch18.bankapp.model.Account;

import java.util.*;

public class AccountDAOImpl implements IAccountDAO{

    private final List<Account> accounts = new ArrayList<>();

    @Override
    public Account saveOrUpdate(Account account) {
        int index = accounts.indexOf(account);      //  equals override to work

        if (index == -1 ) {
            accounts.add(account);                  // insert
            return account;
        }

        // If Account exists
        accounts.set(index, account);               // update
        return accounts.get(index);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(account -> account.getIban().equals(iban));
    }

    @Override
    public Optional<Account> findByIban(String iban) {
        return accounts.stream()
                .filter(account -> account.getIban().equals(iban))
                .findFirst();
    }

    @Override
    public List<Account> getAllAccounts() {
//        return new ArrayList<>(accounts);
        return Collections.unmodifiableList(accounts);
//        return List.copyOf(accounts);
    }

    @Override
    public boolean isAccountExists(String iban) {
        return accounts.stream()
                .anyMatch(account -> account.getIban().equals(iban));
    }

    @Override
    public long count() {
        return accounts.size();
    }
}
