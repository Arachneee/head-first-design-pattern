package pattern.decorator;

public abstract class CondimentDecorator extends Beverage {

	Beverage beverage;
	public abstract String getDescription();
	public Size getSize() {
		return beverage.size;
	}
	public void setSize(Size size) {
		this.size = size;
		beverage.setSize(size);
	}
}
