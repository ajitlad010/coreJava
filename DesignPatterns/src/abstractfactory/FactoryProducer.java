package abstractfactory;

public class FactoryProducer {
	
	public static LoanFactory getFactory(String type) {
		if(type.equals("loan")) {
			return new BankFactory();
		}
		return null;
	}

}
