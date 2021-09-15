package factory;

public class FactoryMain {

	public static void main(String[] args) {
		LoanFactory f = new LoanFactory();
		Loan l = f.getLoan("SBI");
		System.out.println(l.getInterestRate());
		
		Loan l1 = f.getLoan("HDFC");
		System.out.println(l1.getInterestRate());
		
		Loan l2 = f.getLoan("AXIS");
		System.out.println(l2.getInterestRate());

	}

}
