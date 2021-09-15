package factory;

public class LoanFactory {
	
	public LoanFactory() {}

	public Loan getLoan(String type) {
		if(type.equals("SBI")) {
			return new SBI();
		} else if(type.equals("HDFC")) {
			return new HDFC();
		} else if(type.equals("AXIS")) {
			return new AXIS();
		}
		return null;
	}
}
