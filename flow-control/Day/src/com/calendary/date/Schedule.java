package com.calendary.date;
public class Schedule {
    public String monthName;
    private int weekNumber;
    public void SetMonth(int month){    
        if(month==1){
            this.monthName = "January";
        }else if(month==2){
            this.monthName = "February";
        }else if(month==3){
            this.monthName = "March";
        }else if(month==4){
            this.monthName = "April";
        }
        else if(month==5){
            this.monthName = "May";
        }else if(month==6){
            this.monthName = "June";
        }else if(month==7){
           this.monthName = "July";
        }else if(month==8){
           this.monthName = "August";
        }else if(month==9){
            monthName = "September";
        }else if(month==10){
            this.monthName = "October";
        }else if(month==11){
            this.monthName = "November";
        }else if(month==12){
            this.monthName = "December";
        }else{
            this.monthName = "Invalid";
        }
    }

    public int GetWeek(String wkDay){
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
