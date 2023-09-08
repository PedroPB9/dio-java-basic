import com.company.retail.Car;

public class App {
    public static void main(String[] args){
        Car voyage = new Car(200.f);
        voyage.SetModel("Voyage 2015 flex");
        voyage.setColor("Red");
        float gas = voyage.CalculateFuel(5.47f);
        
        System.out.println("Model: "+voyage.GetModel());
        System.out.println("Collor "+voyage.GetColor());
        System.out.println("Fuel Price: R$"+gas);
        

        Car civic = new Car(250.f, 90.f);
        civic.SetModel("Honda Civic 2023");
        civic.setColor("Black");
        gas = civic.CalculateFuel(4.30f);

        System.out.println("Model: "+civic.GetModel());
        System.out.println("Collor "+civic.GetColor());
        System.out.println("Fuel Price: R$"+gas);
    }
}
