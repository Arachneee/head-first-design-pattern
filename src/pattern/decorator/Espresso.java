package pattern.decorator;

public class Espresso extends Beverage {

	public Espresso() {
		description = "에스프레소";
		costValue = 1.99;
	}
	@Override
	public double cost() {
		return costValue * size.getValue();
	}
}
