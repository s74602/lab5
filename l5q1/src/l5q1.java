import javax.swing.JOptionPane;

public class l5q1 {
    
    public static void main(String[] args) {
        
        //      00 - 24 --> 2000 // 25 - 99 ---> 1900
        int currentYear = 2024;
        
        String input = JOptionPane.showInputDialog("Enter your IC number");
        
        String yearPart = input.substring(0,2);//03 = 2003
        String monthPart = input.substring(2,4);
        String dayPart = input.substring(4,6);

        int birthYear = Integer.parseInt(yearPart);
        int month = Integer.parseInt(monthPart);
        int day = Integer.parseInt(dayPart);
        
        if(birthYear <= 24){
            birthYear += 2000;
        }
        else if(birthYear > 24 ){
            birthYear += 1900;
        }
        else{
            System.out.println("ic number is invalid");
        }
        
        int age = currentYear - birthYear;
        String message = String.format("Birth date is %02d-%02d-%d\n Age is %d", day,month,birthYear,age);
        
        JOptionPane.showMessageDialog(null,message);
        
    }
}
