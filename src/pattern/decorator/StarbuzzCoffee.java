package pattern.decorator;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();

		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		beverage2.setSize(Beverage.Size.VENTI);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())));
		System.out.println(beverage3.getDescription() + " $" +beverage3.cost());
	}
}
