public class TypeVariables {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        short length = 100;
        int length2 = length;

        short width = (short)length2;

        String one = " ";

        one = "1" + (1+1);
        System.out.println(one);
    }

    

}
