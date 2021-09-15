package abstractfactory;

public class HDFC implements Loan {

	@Override
	public String getInterestRate() {
		return "HDFC - 8.0";
	}

}
