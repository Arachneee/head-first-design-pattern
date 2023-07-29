package pattern.complex;

public class RedheadDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("꽥꽥");
	}
	Observable observable;

	public RedheadDuck() {
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
