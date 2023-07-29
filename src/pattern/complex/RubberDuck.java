package pattern.complex;

public class RubberDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("삑삑");
	}

	Observable observable;

	public RubberDuck() {
		observable = new Observable(this);
	}


	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
