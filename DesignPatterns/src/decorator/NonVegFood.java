package decorator;

public class NonVegFood extends FoodDecorator {

	public NonVegFood(Food newFood) {
		super(newFood);
	}
	
	@Override
	public String getPrice() {
		return super.getPrice()+"0";
	}
	
	@Override
	public String prepareFood() {
		return super.prepareFood()+" : Adding non veg food";
	}

}
