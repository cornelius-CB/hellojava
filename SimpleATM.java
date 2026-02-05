import java.util.Scanner;

public class SimpleATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPin = "1234";
        double balance = 5000; // initial balance
        int choice;

        System.out.println("===== WELCOME TO SIMPLE ATM =====");
        System.out.print("Enter your PIN: ");
        String pin = sc.nextLine();

        if (!pin.equals(correctPin)) {
            System.out.println("Invalid PIN! Exiting...");
            return;
        }

        System.out.println("Login successful!");

        do {
            System.out.println("\nATM MENU:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance: $" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit successful! New balance: $" + balance);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdraw successful! New balance: $" + balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
