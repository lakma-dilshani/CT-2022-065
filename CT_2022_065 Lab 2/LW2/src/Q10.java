import java.util.Scanner;

public class Q10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double LoanAmount = sc.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double AnnualInterestRate = sc.nextDouble();
        System.out.print("Loan Period: ");
        int LoanPeriod = sc.nextInt();

        int MONTHS_IN_YEAR = 12;

        double MonthlyInterestRate = AnnualInterestRate / 100.0 / MONTHS_IN_YEAR;
        int NumberOfPayments = LoanPeriod * MONTHS_IN_YEAR;
        double MonthlyPayment = (LoanAmount * MonthlyInterestRate) / (1 - Math.pow( 1/(1 + MonthlyInterestRate),
                NumberOfPayments) );
        double TotalPayment = MonthlyPayment * NumberOfPayments;

        System.out.println("Monthly Payment: " + MonthlyPayment);
        System.out.println("Total Payment: " + TotalPayment);

    }
}
