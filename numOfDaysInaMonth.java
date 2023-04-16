import java.util.Scanner;
public class numOfDaysInaMonth {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the month: ");
        String strMonth = keyboard.nextLine();
        System.out.println("Enter the year: ");
        String strYear = keyboard.nextLine();
        int year = 0;
        while (true) {
            try {
                year = Integer.parseInt(strYear);
                if (year < 0) {
                    System.out.println("Invalid year. Please enter the year again!");
                    strYear = keyboard.nextLine();
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Invalid year. Please enter the year again!");
                strYear = keyboard.nextLine();
                continue;
            }
            break;
        }
        int numOfDays = 0;
        while (numOfDays == 0) {
            switch (strMonth) {
                case "January", "Jan.", "Jan", "1",
                        "March", "Mar", "Mar.", "3",
                        "May", "5",
                        "July", "Jul", "7",
                        "August", "Aug.", "Aug", "8",
                        "October", "Oct.", "Oct", "10",
                        "December", "Dec.", "Dec", "12":
                    numOfDays = 31;
                    break;
                case "April", "Apr.", "Apr", "4",
                        "June", "Jun", "6",
                        "September", "Sept.", "Sep", "9",
                        "November", "Nov.", "Nov", "11":
                    numOfDays = 30;
                    break;
                case "February", "Feb.", "Feb", "2":
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        numOfDays = 29;
                    } else {
                        numOfDays = 28;
                    }
                    break;
                default:
                    numOfDays = 0;
                    break;
            }
            if (numOfDays == 0) {
                System.out.println("Invalid month. Please enter the month again!");
                strMonth = keyboard.nextLine();
            }
            else
                System.out.println("number of days in " + strMonth + "/" + year + " is: " + numOfDays);
        }
    }
}
