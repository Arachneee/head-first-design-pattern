package pattern.complex;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
