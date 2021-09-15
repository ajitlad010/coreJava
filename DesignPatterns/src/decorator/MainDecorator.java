package decorator;

public class MainDecorator {
	public static void main(String[] args) {
		Food veg = new VegFood();
		System.out.println(veg.getPrice());
		
		Food nonVeg = new NonVegFood((Food) new VegFood());
		System.out.println(nonVeg.getPrice());
		System.out.println(nonVeg.prepareFood());
	}

}
