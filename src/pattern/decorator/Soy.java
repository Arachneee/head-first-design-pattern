package pattern.decorator;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		this.beverage = beverage;
		costValue = 0.15;
		this.size = beverage.size;
	}

	@Override
	public double cost() {
		return beverage.cost() + costValue * size.getValue();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 두유";
	}
}