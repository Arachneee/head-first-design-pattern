package pattern.complex;

import pattern.adapter.Duck;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		CountingDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}
	void simulate(Quackable duck) {
		duck.quack();
	}

	void simulate(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = duckFactory.createGooseDuck();

		System.out.println("\n오리 시뮬레이션 게임 (+옵저버)");



		Flock flockOfDucks = new Flock();


		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		Flock flockOfMallard = new Flock();

		Quackable mallardDuck1 = duckFactory.createMallardDuck();
		Quackable mallardDuck2 = duckFactory.createMallardDuck();
		Quackable mallardDuck3 = duckFactory.createMallardDuck();
		Quackable mallardDuck4 = duckFactory.createMallardDuck();

		flockOfMallard.add(mallardDuck1);
		flockOfMallard.add(mallardDuck2);
		flockOfMallard.add(mallardDuck3);
		flockOfMallard.add(mallardDuck4);

		flockOfDucks.add(flockOfMallard);

		System.out.println("\n 오리 시뮬레이션 게임: 전체 무리");
		simulate(flockOfDucks);

		System.out.println("\n 오리 시뮬레이션 게임: 물오리 무리");
		simulate(flockOfMallard);

		System.out.println("\n 오리 시뮬레이션 게임: 옵저버");
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		simulate(flockOfDucks);

		System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getQuacks() + " 번");
	}
}
