import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class RiskyLending {

    public static Payments calculatePayments(int loanTotal, int periods, double interestRate, List<Integer> investorContributions, List<Double> borrowerPaymentRatios) {
        // Starting point for your code
    	//Investor side calculate each month
    	int loanAmount ; BigDecimal montlyResult = new BigDecimal(0);
    	
    	for (int i= 0 ;i< periods ;i++ ) {
    		
    		for( int j =0 ;j < borrowerPaymentRatios.size() ;j++)
    		{
    			loanAmount =  (int) ((Double.valueOf( loanTotal) * borrowerPaymentRatios.get(i)));
    			BigDecimal montlyPayment = calculateMonthlyRepayment(loanAmount, interestRate, periods);
    			montlyResult = montlyResult.add(montlyPayment );
    			
    		}
    		System.out.println(  montlyResult  ) ;
		}
    	
    	
        return null;
    }

    // Feel free to add your own classes and method if necessary
    static BigDecimal calculateMonthlyRepayment(int loanAmount, Double interestRate, int periods) {
        BigDecimal r = BigDecimal.valueOf(interestRate).divide(BigDecimal.valueOf(12), 20, RoundingMode.HALF_EVEN).divide(BigDecimal.valueOf(100), 20, RoundingMode.HALF_EVEN);
        BigDecimal onePlusR = r.add(BigDecimal.ONE);
        BigDecimal top = r.multiply(onePlusR.pow(periods));
        BigDecimal bottom = (onePlusR.pow(periods)).subtract(BigDecimal.ONE);
        return BigDecimal.valueOf(loanAmount).multiply(top.divide(bottom, 20, RoundingMode.HALF_UP));
    }

     public static void main(String args[]) {
    	 List<Integer> investorContributions = new ArrayList<Integer>();
    	 investorContributions.add(500000);
    	 investorContributions.add(500000);
    	 
    	 List<Double> borrowerPaymentRatios = new ArrayList<Double>();
    	 borrowerPaymentRatios.add(0.25);
    	 borrowerPaymentRatios.add(0.25);
    	 borrowerPaymentRatios.add(0.5);
    	 
    	 
    	 
    	 calculatePayments(1000000, 12, 0.5,investorContributions, borrowerPaymentRatios);
     }
    public static class Payments {

        private List<BigDecimal> borrowerPayments;
        private List<BigDecimal> investorMonthlyRepayments;

        public Payments(List<BigDecimal> borrowerPayments, List<BigDecimal> investorMonthlyRepayments) {
            this.borrowerPayments = borrowerPayments;
            this.investorMonthlyRepayments = investorMonthlyRepayments;
        }

        public List<BigDecimal> getBorrowerPayments() {
            return this.borrowerPayments;
        }

        public List<BigDecimal> getInvestorMonthlyRepayments() {
            return this.investorMonthlyRepayments;
        }

        @Override
        public boolean equals(Object other) {
            return other instanceof Payments &&
                    this.borrowerPayments.equals(((Payments) other).getBorrowerPayments()) &&
                    this.investorMonthlyRepayments.equals(((Payments) other).getInvestorMonthlyRepayments());
        }

        @Override
        public String toString() {
            return this.borrowerPayments.toString() + " " + this.investorMonthlyRepayments.toString();
        }
    }
}