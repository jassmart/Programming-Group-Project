import java.util.Scanner;

public class UserAccounts {
//An array to store 8 accounts
private Account[] accounts = new Account[8];
// the no-argument constructor
public UserAccounts() {
    for (int i = 0; i < 8; i++) {
        accounts[i] = new Account(i, 50);
    }
}

public static void main(String[] args) {
    UserAccounts bank = new UserAccounts();
    Scanner input = new Scanner(System.in);
 
//need to add a while loop to have the system ask indefinitely. It ask for id, it will read the id,and then use that number to access that numbered account
    while (true) {
        System.out.print("Enter an id: ");
        int id = input.nextInt();

//need an if statement to filter out things that will not work and cause an error. so if i<0 or i>7

        if (id < 0 || id > 7) {
            System.out.println("Invalis ID. Please try again.");
//Continue will keep program running and send you back to beginning of the while loop
            continue;
        }

        while (true) {
//add display menu here
            System.out.println("\nMain menu");
            System.out.println("1: Check Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit");

            System.out.print("Enter a choice: ");
            int choice = input.nextInt();

//For the switch, we need 4 main functions. get balance, withdraw, deposit, and exit menu
            switch (choice) {
                case 1:
                    System.out.printf("The balance is $%.2f%n", 
                        bank.accounts[id].getBalance());
                    break;

                case 2:
                    System.out.printf("Enter an amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();

                    bank.accounts[id].withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.printf("Enter an amount to deposit: ");
                    double depositAmount = input.nextDouble();

                    bank.accounts[id].deposit(depositAmount);
                    break;
                case 4:
                    System.out.printf("The balance is $%.2f%n", 
                        bank.accounts[id].getBalance());
                    break;
            
                default:
                    System.out.println("Invalis choice. Try again.");
                    
            }

            //if statement 4, like assignment asks, uses an if statement to break the loop.
            if (choice == 4) {
                break;
            }

        }
        
    }

}

}
