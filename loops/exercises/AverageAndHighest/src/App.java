import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i, j;
        float average=0.f, highest=0.f, sum =0.f;
        float num;

        for(i=0;i<5;i++){
            System.out.println("Tell me a number: ");
            num = scanner.nextFloat();
            sum += num;
            if(num > highest || i == 0){
                highest = num;
            }
        }
        average = sum/5;
        System.out.println("Average: "+average);
        System.out.println("Highest: "+highest);
    }
}
