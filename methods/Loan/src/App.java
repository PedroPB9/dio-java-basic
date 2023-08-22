import management.Loan;
public class App {
    public static void main(String[] args) throws Exception {
        Loan loan = new Loan(1000.f);
        float ln = loan.make_loan(2);
        loan.display_loan(ln);
    }
}
