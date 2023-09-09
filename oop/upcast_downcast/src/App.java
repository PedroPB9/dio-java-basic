public class App {
    public static void main(String[] args) throws Exception {
        Employee janitor = new Janitor();//upcast
        //data that exists in janitor but doesn't in employee remains at janitor instace
        //data in Employee


        Retailer retailer = (Retailer) new Employee();//downcast
        //data in Employee that doesn't exist in Retailer remains at employee instance
        //data that doesn't exist in Employee but does in Retailer there's no objct to go
        //data that exists in both is copied from employee to retailer
    }
}
