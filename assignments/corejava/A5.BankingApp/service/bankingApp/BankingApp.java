import java.util.Scanner;

import service.bankingApp.BankOperation;
import service.bankingApp.BankOperationImpl;

public class BankingApp {

    public static void main(String[] args) {
        BankOperation bankOperation = new BankOperationImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bank Application Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Read Account");
            System.out.println("3. Update Account");
            System.out.println("4. Delete Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter Account Holder: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    bankOperation.createAccount(accountNumber, accountHolder, balance);
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    String accountInfo = bankOperation.readAccount(accountNumber);
                    System.out.println(accountInfo);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter New Balance: ");
                    double newBalance = scanner.nextDouble();
                    bankOperation.updateAccount(accountNumber, newBalance);
                    System.out.println("Account balance updated successfully!");
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    bankOperation.deleteAccount(accountNumber);
                    System.out.println("Account deleted successfully!");
                    break;

                case 5:
                    System.out.println("Exiting the Bank Application. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
