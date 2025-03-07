package chapter2.interfaceexample.v1;

public class Bird implements Animal, Flyable {

    // 다중 구현 (인터페이스 2개 활용)

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    void land(){

    }
}
