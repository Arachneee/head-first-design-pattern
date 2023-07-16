package pattern.command;

public class Light {
    String location;
    public Light(String location) {
        this.location = location;
    }
    public void on() {
        System.out.println(location + " 불 켜짐");
    }
    public void off() {
        System.out.println(location + " 불 꺼짐");
    }
}
