package chapter2.interfaceexample;

public class Main {
    public static void main(String[] args) {
        // 인스턴스화
        LuxuryCar luxuryCar = new LuxuryCar();
        SpeedCar speedCar = new SpeedCar();

        // 활용
//        luxuryCar.move();
//        luxuryCar.stop();

//        speedCar.move();
//        speedCar.stop();
//        speedCar.drive();
        // 이렇게 일관성 없는 모습 때문에 인터페이스를 활용하는 것!

        // 인터페이스 활용
        luxuryCar.drive();
        speedCar.drive();

        luxuryCar.stop();
        speedCar.stop();

        // 인터페이스 확장
        luxuryCar.charge();
        speedCar.autoParking();
    }
}
