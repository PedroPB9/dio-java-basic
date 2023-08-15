import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        float grade;

        System.out.println("Grade: ");
        grade = scanner.nextFloat();
        while(grade >= 0.f && grade <= 10.f){
            System.out.println("Your grade: "+grade);

            System.out.println("Grade: ");
            grade = scanner.nextFloat();
        }

    }
}
