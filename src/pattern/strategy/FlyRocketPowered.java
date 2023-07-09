package pattern.strategy;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 로켓 추친으로 날아갑니다!");
    }
}
