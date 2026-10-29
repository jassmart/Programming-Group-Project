public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        account1.withdraw(2500);
        account1.deposit(3000);

        System.out.printf("Account Balance: $%.2f%n", account1.getBalance());
        System.out.printf("Monthly Interest: $%.2f%n", account1.getMonthlyInterest());
        System.out.println("Date Created: " + account1.getDateCreated());

    }
}
