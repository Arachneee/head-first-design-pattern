package pattern.proxy;

import pattern.proxy.GumballMachine;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어 주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어 주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어 주세요.");
    }
    @Override
    public void refill() {
        System.out.println("아직 매진 안됐어요.");
    }
}
