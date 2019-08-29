public class BankAccount
{
    private double balance;
    private String accountHolder;
    private int accountNumber;
    private String password;
    private boolean loggedIn;

    public BankAccount(double balance, String accountHolder, int accountNumber,
    String password)
    {
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.password = password;
        this.loggedIn = false;
    }

    //mutator - allow you to change an instance variable (attribute)
    public void logIn(String name, String password)
    {
        if (this.accountHolder.equals(name) && this.password.equals(password))
        {
            this.loggedIn = true;
        }
    }

    //mutator methods to change the balance
    public void deposit(double amount)
    {
        if(loggedIn)
        {
            balance = balance + amount;

        }else
        {
            throw new IllegalStateException("You are not logged in.");
        }
    }

    public String toString()
    {
        return accountHolder + " Account Number " + accountNumber + "balance" + balance;
    }

    //accessor - gives access to the balance instance variable (attribute)
    public double getBalance()
    {
        if (loggedIn == true)
        {
            return balance;
        }
        else
        {
            throw new IllegalStateException("You are not logged in.");
        }
    }   
    
    public void withdraw(double amount)
    {
        if(loggedIn == true)
        {
            balance = balance - amount;

        } 
        else
        {
            throw new IllegalStateException("You are not logged in.");
        }
    }
}   
 