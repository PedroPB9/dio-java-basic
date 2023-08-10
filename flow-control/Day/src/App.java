import java.util.Scanner;
import com.calendary.month.Month;;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Month(number): ");
        int month = scanner.nextInt();
        Month monthName = new Month();
        String monthValue = monthName.GetMonth(month);
        System.out.println("Month name: "+monthValue);


        System.out.println("Weekday: ");
        String weekDay = scanner.next();
        int weekNumber = GetWeek(weekDay);
        if(weekNumber != 0){
            System.out.println("Week number: "+weekNumber);
        } else{
            System.out.println("Week number: INVALID");
        }

        boolean holiday = monthValue == "December" || monthValue == "January" || monthValue == "July";
        if(holiday){
            System.out.println("Holiday");
        }
        
        
    }

    public static int GetWeek(String wkDay){
        int weekNumber;
        switch(wkDay){
            case "Monday":
                weekNumber = 2;
                break;
            case "Tuesday":
                weekNumber = 3;
                break;
            case "Wednsday":
                weekNumber = 4;
                break;
            case "Thursday":
                weekNumber = 5;
                break;
            case "Friday":
                weekNumber = 6;
                break;
            case "Saturday":
                weekNumber = 7;
                break;
            case "Sunday":
                weekNumber = 1;
                break;
            default:
                weekNumber = 0;
                break;
        }

        return weekNumber;
    }
    
}
