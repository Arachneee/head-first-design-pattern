package pattern.decorator;

public abstract class Beverage {

	public enum Size {
		TALL(1), GRANDE(1.1), VENTI(1.2);

		private final double value;
		Size(double value) {
			this.value = value;
		}
		public double getValue() {
			return value;
		}
	};
	Size size = Size.TALL;
	String description = "제목 없음";
	double costValue = 0.0;

	public void setSize(Size size) {
		this.size = size;
	}
	public Size getSize() {
		return this.size;
	}

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
