package chapter2.finalexample;

public class Main {
    public static void main(String[] args) {

        // final 활용 방법
        // final 키워드는 변수의 변경을 불가능하게 함
        // final이 붙으면 상속을 활용할 수 없게 되기 때문
        final int a = 1;
//        a = 2;
        System.out.println("a = " + a);

        // 상수 활용 방법
        System.out.println("상수 활용 : " + Circle.PI);

        // 불변 객체 활용 방법
        final Circle c1 = new Circle(2);
        // 참조 변경을 막지만, 내부 상태 변경은 막지 않습니다.
        // 내부 변경을 막아주려면 속성에도 final 키워드를 사용해야 함
//        c1 = new Circle(5);
        System.out.println("c1 = " + c1);

        // 불변 객체의 내부상태가 변깅이 필요한 경우
        Circle c2 = new Circle(10); // 방법1 - 생성자
        Circle c3 = c2.changeRadius(20); // 방법2 - 기능을 활용
    }
}
