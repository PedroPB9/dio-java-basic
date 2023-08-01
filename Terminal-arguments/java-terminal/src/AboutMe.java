import java.util.Locale;
import java.util.Scanner;;
public class AboutMe {
    public static void main(String[] args){
        /*String name = args[0];
        String lastName = args[1];
        int age = Integer.valueOf(args[2]);*/

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String name = scanner.next();
        String lastName = scanner.next();
        int age = scanner.nextInt();

        System.out.println("Hey, my name is " + name + " " + lastName+ "!");
        System.out.println("I'm " + age + " years old");
    }
}
