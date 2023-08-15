import java.util.Scanner;
import com.calendary.date.Schedule;;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Month(number): ");
        int month = scanner.nextInt();
        Schedule schedule = new Schedule();
        schedule.SetMonth(month);
        System.out.println("Month name: "+schedule.monthName);
        


        System.out.println("Weekday: ");
        String weekDay = scanner.next();
        int weekNumber = schedule.GetWeek(weekDay);
        if(weekNumber != 0){
            System.out.println("Week number: "+weekNumber);
        } else{
            System.out.println("Week number: INVALID");
        }

        switch(schedule.monthName){
            case "December":
            case "January":
            case "July":
                System.out.print("Holiday");
                break;
            default:
                System.out.print("Not a holiday");
                break;
        }
        
        
    }
    
}
