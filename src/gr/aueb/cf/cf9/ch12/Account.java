package gr.aueb.cf.cf9.ch12;

public class Account {

    private long id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account(){

    }

    public Account(long id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Public API

    /**
     * Deposits a certain amount of money into the account
     * @param amount        amount of deposit
     * @throws Exception    if the amount is negative
     */
    public void deposit(double amount) throws Exception{
        try {
            if (amount < 0 ) throw new Exception("The amount should be positive");
            balance += amount;
            // log
        } catch (Exception e) {
            System.err.println("Negative amount: " + amount + " is not allowed");
            throw e;
        }
    }

    /**
     * Withdraws the specified amount of money from account
     *
     * @param amount       amount of money
     * @param ssn          the SSN of account holder
     * @throws Exception   if account is negative or insufficient balance
     *                     or SSN does not match
     */
    public void withdraw(double amount, String ssn) throws Exception{
        try {
            if (amount < 0 ) throw new Exception("The amount should be positive");
            if (amount > balance) throw new Exception("Insufficient balance.");
            if (!ssn.equals(this.ssn)) throw new Exception("The SSN does not match");
            balance -= amount;
        }catch (Exception e){
            System.err.println("Withdraw failed. "+ "\n" + e.getMessage());
            throw e;
        }
    }

    /**
     * Returns current balance of account
     * @return  current balance of account
     */
    public double getAccountBalance(){
        return getBalance(); // or return balance;
    }

    /**
     * Returns the state of the account as a string.
     * @return  the string representation of the {@link Account} object.
     */
    public String accountToString(){
        return "Account:" + id + " IBAN: " + iban + " Firstname: " + firstname +
                " Lastname: " + lastname + " SSN: " + ssn + " Balance: " + balance;
    }

    //is not part of Public API
    private boolean isSsnValid(String ssn){
        return this.ssn.equals(ssn);
    }
}
