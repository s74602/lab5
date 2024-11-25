/*NAME: AHMAD ALIF ZULFADLI
 *METRIC NUMBER:S74602
 *MODULE:5
 *ACTIVITY 4
*/
import javax.swing.JOptionPane;

public class l5q4 {

    public static void main(String[] args) {

        String inputDate, day, month, year, day_of_week;

        inputDate = JOptionPane.showInputDialog("Enter date: ");//user input date

        //example date:25/06/2024
        day = inputDate.substring(0, 2);//index 0 = 2, index 1 = 5
        month = inputDate.substring(3, 5);//index 3 = 0, index 4 = 6
        year = inputDate.substring(6, 10);//index 6 = 2, index 7 = 0
        //index 8 = 2, index 9 = 4

        int q = Integer.parseInt(day);//convert day to integer as q value
        int m = Integer.parseInt(month);//convert month to integer as m value
        int y = Integer.parseInt(year);//convert year to integer as y value

        if (m == 1 || m == 2) {
            m = m + 12;//adjust month 1 or 2 to 13 , 14
            y = y - 1;// year - 1
        }

        int h = (q + (13 * (m + 1)) / 5 + y + (y / 4) - (y / 100) + (y / 400)) % 7;

        switch (h) {
            case 1:
                day_of_week = "SUNDAY";
                break;
            case 2:
                day_of_week = "MONDAY";
                break;
            case 3:
                day_of_week = "TUESDAY";
                break;
            case 4:
                day_of_week = "WEDNESDAY";
                break;
            case 5:
                day_of_week = "THURSDAY";
                break;
            case 6:
                day_of_week = "FRIDAY";
                break;
            case 7:
                day_of_week = "SATURDAY";
                break;
            default:
                day_of_week = "invalid date";
                break;
        }

        JOptionPane.showMessageDialog(null, "The day of week is " + day_of_week);

    }
}
