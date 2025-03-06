package chapter2.staticexample;

public class Main {
    public static void main(String[] args) {

        // 클래스 멤버
        // static 변수와 메서드 활용
        // 객체를 생성하지 않고도 클래스(Person)에 접근해서 바로 사용 가능
        // static으로 선언된 변수와 메서드는 MethodArea에 저장되었기 때문
        System.out.println("static 변수 활용 : " + Person.population);
        Person.printPopulation();

        // 인스턴스 멤버 활용 => 객체 생성
        Person p1 = new Person();
        Person p2 = new Person();

        // 인스턴스 변수 활용
        p1.name = "hanni";
        p2.name = "gonaeun";

        // 인스턴스 메서드 활용
        p1.printName();
        p2.printName();


        // 인스턴스 멤버는 각 객체가 개별적으로 값을 가짐(공유x)
        // 클래스 멤버는 객체가 공유하는 공간

        // 인스턴스 2개 생성한 후, 생성자 호출
        // 인스턴스가 클래스 안에서 static값인 population을 공유해서 사용하기 때문
        Person.printPopulation();  // 2 출력
    }
}
