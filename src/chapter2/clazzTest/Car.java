package chapter2.clazzTest;

public class Car {
    // 1. 속성
    String name;
    String model;
    String color;

    // 2. 생성자
    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    // 3. 기능
    public void drive() {
        System.out.println("당신의 "+color+" "+model+" "+name+"가 주행을 시작합니다.");
    }
}
