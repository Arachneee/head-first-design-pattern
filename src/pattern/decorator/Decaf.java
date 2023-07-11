package pattern.decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "디카페인";
		costValue = 1.05;
	}
	@Override
	public double cost() {
		return costValue * size.getValue();
	}
}
