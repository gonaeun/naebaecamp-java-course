package chapter2.interfaceexample.v3;

public class TV implements ElectronicDevice {
    @Override
    public void turnOff() {
        System.out.println("TV 전원을 끕니다");
    }

    @Override
    public void turnOn() {
        System.out.println("TV 전원을 켭니다");
    }

    void changeChannel() {
        System.out.println("채널을 변경합니다");
    }
}
