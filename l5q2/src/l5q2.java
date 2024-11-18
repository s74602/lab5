/*NAME: AHMAD ALIF ZULFADHLI
* METRIC NUMBER: S74602
* MODULE: 5
* ACTIVITY 2
*/
import java.util.Scanner;

public class l5q2 {
       public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double sale;
        
        System.out.print("Please enter sale value: ");
        sale = input.nextDouble();
        
        if(sale < 10.000){
            System.out.println("total rate is 10%");
        }
        
        else if((sale > 10.000 ) && (sale < 15.000)){
            System.out.println("total rate is 15%");
        }
            
        else if(sale > 15.000){
            System.out.println("total rate is 20%");
        }
        
        else{
            System.out.println("invalid input");
        }
        
    }
}
