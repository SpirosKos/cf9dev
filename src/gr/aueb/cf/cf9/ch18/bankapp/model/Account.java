package gr.aueb.cf.cf9.ch18.bankapp.model;

import java.util.Objects;

public class Account {
    private String iban;
    private String balance;

    public Account(){

    }

    public Account(String iban, String balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Account account)) return false;
        return Objects.equals(this.getIban(), account.getIban());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIban());
    }
}
