package pattern.proxy;

import pattern.proxy.GumballMachine;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("매진되었습니다. 다음 기회에 이용해 주세요.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진 되었습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("매진입니다.");
    }
    @Override
    public void refill() {
        System.out.println("알맹이를 리필합니다.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
