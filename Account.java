import java.util.Date;

public class Account {

    //We need a private integer variable for the account number
    private int id = 0;
    //We also need a private variable to store balance info
    private double balance = 0;
    //The intrest rate here will be shared by all accounts
    private static double annualInterestRate = 0;
    private Date dateCreated;

    //No argument constructor. It's public so other classes can call this constructor. It calls specifically on date and time. References are stored in dateCreated
    public Account() {
        dateCreated = new Date();
    }

    //this constructor will let us make an account with a specific ID and balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    //Assignment requires a getter and setter for account id
    public int getID() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //need to get balance, annual interest and date. Also need to set the date
    public double getBalance(){
        return balance;
    }

    public static double getAnnualIntrestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }

    public Date getDateCreated() {
        return new Date(dateCreated.getTime());
    }

    //need a method to calculate and return our interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate(); 
    }

    //need a withdrawl from balance
    public void withdraw(double amount){
        balance = balance - amount; 
    }
     //need a depostit to balance
    public void deposit(double amount){
        balance = balance + amount; 
    }


    
}
