import management.Loan;
public class App {
    public static void main(String[] args) throws Exception {
        Loan loan = new Loan(2, 1000.f);
        Loan nl = new Loan(6, 1000.f);

        float ln = loan.final_price;
        float j = nl.final_price;
        
        loan.display_loan(ln);
        loan.display_loan(j);
    }
}
