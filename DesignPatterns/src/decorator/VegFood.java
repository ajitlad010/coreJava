package decorator;

public class VegFood implements Food {

	@Override
	public String prepareFood() {
		return "Veg Food";
	}

	@Override
	public String getPrice() {
		return "50.0";
	}

}
