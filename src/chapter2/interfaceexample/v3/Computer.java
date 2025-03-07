package chapter2.interfaceexample.v3;

public class Computer implements ElectronicDevice {
    @Override
    public void turnOff() {
        System.out.println("컴퓨터 전원을 끕니다");
    }

    @Override
    public void turnOn() {
        System.out.println("컴퓨터 전원을 켭니다");
    }

    void setTime() {
        System.out.println("컴퓨터 세팅 시간을 설정합니다");
    }
}
