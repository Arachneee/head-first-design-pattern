package pattern.command;

public class GarageDoor {
    String location;
    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " 문이 올라갑니다.");
    }
    public void down() {
        System.out.println(location + " 문이 내려갑니다.");
    }
    public void stop() {
        System.out.println(location + " 문이 멈춥니다.");
    }
    public void lightOn() {
        System.out.println(location + " 불이 켜집니다.");
    }
    public void lightOff() {
        System.out.println(location + " 불이 꺼집니다.");
    }
}
