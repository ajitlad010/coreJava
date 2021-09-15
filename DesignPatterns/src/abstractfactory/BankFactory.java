package abstractfactory;


public class BankFactory extends LoanFactory {

	@Override
	public Loan getLoan(String bankName) {
		if(bankName.equals("HDFC")) {
			return new HDFC();
		} else if(bankName.equals("AXIS")) {
			return new AXIS();
		}
		return null;
	}

}
