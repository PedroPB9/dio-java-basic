import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Month(number): ");
        int month = scanner.nextInt();

        System.out.println("Weekday: ");
        String weekDay = scanner.next();
        int weekNumber;

        String monthName = " ";
        if(month==1){
            monthName = "January";
        }else if(month==2){
            monthName = "February";
        }else if(month==3){
            monthName = "March";
        }else if(month==4){
            monthName = "April";
        }
        else if(month==5){
            monthName = "May";
        }else if(month==6){
            monthName = "June";
        }else if(month==7){
            monthName = "July";
        }else if(month==8){
            monthName = "August";
        }else if(month==9){
            monthName = "September";
        }else if(month==10){
            monthName = "October";
        }else if(month==11){
            monthName = "November";
        }else if(month==12){
            monthName = "December";
        }else{
            monthName = "Invalid";
        }

        boolean holiday = monthName == "December" || monthName == "January" || monthName == "July";
        if(holiday){
            System.out.println("Holiday");
        }

        switch(weekDay){
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
                System.out.println("Invalid week");
                break;
        }
    }
    
}
