package chapter2.finalexample;

public class Circle {

    // 속성
    final static double PI = 3.14159;
    // 불변객체로 만들어주려면 final 키워드를 모든 속성에 사용해주어야 함
    final double radius;

    // 생성자
    Circle(double radius) {
        this.radius = radius;
    }

    // 기능
    Circle changeRadius(double newRadius) {
        return new Circle(newRadius);
    }

}
