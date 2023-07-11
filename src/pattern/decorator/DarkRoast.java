package pattern.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "다크 로스트커피";
	}
	@Override
	public double cost() {
		return .99;
	}
}
