/*NAME: AHMAD ALIF ZULFADHLI
* METRIC NUMBER: S74602
* MODULE: 5
* ACTIVITY 2
*/
import java.util.Scanner;

public class l5q3 {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int acc_number, attempt = 0, max_attempt = 5;
        char acc_type;
        final double minimum_balance = 2500.00;
        double service_charge_savingAccount = 10.00;
        double current_balance, balance_after_charge = 0, balance_after_receive_interest = 0;
        double total_interest;

        while (attempt < max_attempt) {

            System.out.print("Please enter s for saving account and c for checking account: ");
            acc_type = input.next().charAt(0);

            if ((acc_type == 's') || (acc_type == 'S')) {

                System.out.print("\nThis is saving account");

                System.out.print("\nPlease enter your account number: ");
                acc_number = input.nextInt();

                System.out.print("\nPlease enter your current balance in your account: ");
                current_balance = input.nextDouble();

                if (current_balance > minimum_balance) {
                    total_interest = current_balance * 0.04;
                    balance_after_receive_interest = current_balance + total_interest;

                    System.out.println("Account Number: " + acc_number);
                    System.out.println("Account Type: " + acc_type);
                    System.out.println("Current Balance: " + current_balance);
                    System.out.println("New Balanace: " + balance_after_receive_interest);
                    System.out.println("-----------------------------------------");
                } else {
                    balance_after_charge = current_balance - service_charge_savingAccount;

                    System.out.println("Account Number: " + acc_number);
                    System.out.println("Account Type: " + acc_type);
                    System.out.println("Current Balance: " + current_balance);
                    System.out.println("New Balanace: " + balance_after_charge);
                    System.out.println("-----------------------------------------");
                }
            } else if ((acc_type == 'c') || (acc_type == 'C')) {
                System.out.print("\nThis is checking account");

                System.out.print("\nPlease enter your account number: ");
                acc_number = input.nextInt();

                System.out.print("\nPlease enter your current balance in your account: ");
                current_balance = input.nextDouble();

                if (current_balance > minimum_balance + 5000) {
                    total_interest = current_balance * 0.03;
                    balance_after_receive_interest = current_balance + total_interest;

                    System.out.println("Account Number: " + acc_number);
                    System.out.println("Account Type: " + acc_type);
                    System.out.println("Current Balance: " + current_balance);
                    System.out.println("New Balanace: " + balance_after_receive_interest);
                    System.out.println("-----------------------------------------");
                } else {
                    total_interest = current_balance * 0.05;
                    balance_after_receive_interest = current_balance + total_interest;

                    System.out.println("Account Number: " + acc_number);
                    System.out.println("Account Type: " + acc_type);
                    System.out.println("Current Balance: " + current_balance);
                    System.out.println("New Balanace: " + balance_after_receive_interest);
                    System.out.println("-----------------------------------------");
                }

            } else {
                System.out.println("invalid account");
                System.out.println("-----------------------------------------");

            }
            attempt++;
        }

    }
}
