package abstractfactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		LoanFactory l = FactoryProducer.getFactory("loan");
		Loan loan = l.getLoan("AXIS");
		System.out.println(loan.getInterestRate());
	}

}
