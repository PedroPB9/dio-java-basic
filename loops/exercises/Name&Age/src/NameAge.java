import java.util.Scanner;
public class NameAge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = " ";
        int age;

        while(true) {
            
            System.out.println("Name:");
            name = scanner.next();
            if(name.equals("0")){break;}

            System.out.println("Age:");
            age = scanner.nextInt();

            System.out.println(name);
            System.out.println(age);
            
        }
        System.out.println("END");
    }
}
