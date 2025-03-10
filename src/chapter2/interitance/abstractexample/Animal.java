package chapter2.interitance.abstractexample;

// 추상클래스 선언
abstract class Animal {
    public String name;

    // 추상메서드 : 상속 받은 자식은 강제로 구현해야함
    abstract void eat();

    public void sleep() {
        System.out.println("쿨쿨...");
    }
}
