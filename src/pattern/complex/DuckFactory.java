package pattern.complex;

public class DuckFactory extends AbstractDuckFactory {
	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

	public Quackable createGooseDuck() {
		return new GooseAdapter(new Goose());
	}
}
