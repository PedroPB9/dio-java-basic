import management.Loan;
public class App {
    public static void main(String[] args) throws Exception {
        Loan loan = new Loan();
        float ln = loan.make_loan(1000.f, 2);
        loan.display_loan(ln);
    }
}
