package pattern.decorator;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		this.beverage = beverage;
		costValue = .10;
		this.size = beverage.size;
	}

	@Override
	public double cost() {
		return beverage.cost() + costValue * size.getValue();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑크림";
	}
}