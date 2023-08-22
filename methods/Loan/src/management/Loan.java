package management;
public class Loan {
    float total_price;
    public Loan(float loaned){
        total_price = loaned;
    }
    private float calculate(float x, float y, int mode){
        float result = 0.f;
        switch(mode){
            case 0:
                result = x+y;
                break;
            case 1:
                result = x-y;
                break;
            case 2:
                result = x*y;
                break;
            case 3:
                result = x/y;
                break;
        }
        return result;
    }

    private String greet(int hour){
        switch(hour){
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
                return "Good night";
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return "Good morning";
            case 12:
            case 13:
            case 14:
            case 15:
                return "Good afternoon";
            case 16:
            case 17:
            case 18:
            case 19:
                return "Good evening";
            default:
                return "Hello";
        }  
    }

    public float make_loan(int month){
        float fee_pct = 3.5f;
        float fee = calculate(calculate(fee_pct, total_price, 2), 100, 3);
        float loan = calculate(total_price, calculate(fee, month, 3), 0);

        return loan;
    }

    public void display_loan(float loan){
        System.out.println(greet(10)+"! The final price of your loan is: R$"+ loan);
    }
}