package chapter2.interfaceexample.v3;

public class AirConditioner implements ElectronicDevice {
    @Override
    public void turnOff() {
        System.out.println("에어컨 전원을 끕니다");
    }

    @Override
    public void turnOn() {
        System.out.println("에어컨 전원을 켭니다");
    }

    void setTemperature(){
        System.out.println("에어컨 온도를 조절합니다");
    }
}
