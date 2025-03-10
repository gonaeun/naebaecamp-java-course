package chapter2.interitance.abstractexample;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(); // 추상클래스로 객체 생성 못함
        Cat cat = new Cat();
        cat.name = "cat";
        cat.sleep();
        cat.eat(); // 추상메서드 : 자식클래스에서 강제 구현

        // 모든 객체는 Object 클래스를 상속한다
        // Object //Class Object is the root of the class hierarchy.
    }
}
