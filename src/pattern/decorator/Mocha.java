package pattern.decorator;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		costValue = .20;
		this.size = beverage.size;
	}

	@Override
	public double cost() {
		return beverage.cost() + costValue * size.getValue();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}
}
