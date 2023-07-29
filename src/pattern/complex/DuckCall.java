package pattern.complex;

public class DuckCall implements Quackable {


	@Override
	public void quack() {
		System.out.println("꽉꽉");
		notifyObservers();
	}

	Observable observable;

	public DuckCall() {
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
