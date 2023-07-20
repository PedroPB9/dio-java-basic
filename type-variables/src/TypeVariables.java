public class TypeVariables {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    short length = 100;
    int length2 = length;

    short width = (short)length2;
}
