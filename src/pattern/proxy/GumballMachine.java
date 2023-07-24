package pattern.proxy;

import pattern.proxy.HasQuarterState;
import pattern.proxy.NoQuarterState;
import pattern.proxy.SoldOutState;
import pattern.proxy.SoldState;
import pattern.proxy.State;
import pattern.proxy.WinnerState;

public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State state;
    int count = 0;
    String location;

    public GumballMachine(String location, int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.location = location;


        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }
    public String getLocation() {
        return location;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    void setState(State state) {
        System.out.println(this.state.getClass() + " -> " + state.getClass());
        this.state = state;
    }
    void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0) {
            count--;
        }
    }
    void refill(int numberGumballs) {
        System.out.println("알맹이를 리필합니다.");
        state.refill();
        if (count <= 0) {
            count = numberGumballs;
        }
    }
    public String toString() {
        return "주식회사 왕뽑기\n자바로 돌아가는 최신형 뽑기 기계\n남은 개수: " + count + "개\n동전 투입 대기중\n";
    }
}
