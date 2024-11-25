/*
NAME: AHMAD ALIF ZULFADHLI
METRIC NUMBER:S74602
MODULE: 5
ACTIVITY:1
*/
import java.util.Scanner;

public class l5q5 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String customer_Name, color_of_character, wood_Type;
        int num_of_character;
        String oak = "oak", mahogany = "mahogany", gold = "gold";
        double minimum_charge = 30;
        double price1 = 0, price2 = 0, price3 = 0, total_price;

        System.out.print("Please enter name: ");
        customer_Name = input.next();
        System.out.print("Please enter wood type: ");
        wood_Type = input.next();
        System.out.print("Please enter number of character: ");
        num_of_character = input.nextInt();
        System.out.print("Please enter color of character: ");
        color_of_character = input.next();

        if (wood_Type.equals(oak) && num_of_character > 6 && color_of_character.equals(gold)) {
            price1 = minimum_charge + 15;
            price2 = (num_of_character * 3) - 18;
            price3 = (minimum_charge + 12) - minimum_charge;
        } else if (wood_Type.equals(mahogany) && num_of_character > 6 && color_of_character.equals(gold)) {
            price1 = minimum_charge + 10;
            price2 = (num_of_character * 3) - 18;
            price3 = (minimum_charge + 12) - minimum_charge;
        } else {
            System.out.println("invalid input!!");
        }

        total_price = price1 + price2 + price3;

        System.out.println("\nName: " + customer_Name + "\nWood Type: " + wood_Type + "\nNumber of character: " + num_of_character + "\nColor of Character: " + color_of_character + "\nTotal price: RM" + total_price);
    }
    
}
