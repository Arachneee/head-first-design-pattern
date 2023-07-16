package pattern.command;

public class Stereo {
    String location;
    String value;
    int volume;
    public Stereo(String location) {
        this.location = location;
        volume = 10;
        value = "라디오";
    }
    public void on() {
        System.out.println(location + "의 " + value + "가 켜졌습니다.");
    }
    public void off() {
        System.out.println(location + "의 " + value + "가 꺼졌습니다.");
    }
    public void setCd() {
        value = "CD";
        System.out.println(location + "의 " + "CD를 넣습니다.");
    }
    public void setDvd() {
        value = "DVD";
        System.out.println(location + "의 " + "DVD를 넣습니다.");
    }
    public void setRadio() {
        value = "오디오";
        System.out.println(location + "의 " + "오디오를 넣습니다.");
    }
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + "의 " + value + " 볼륨을 " + volume + "로 조절합니다.");
    }
}
