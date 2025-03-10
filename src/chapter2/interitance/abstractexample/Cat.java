package chapter2.interitance.abstractexample;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("냠냠...!"); // 추상메서드 : 자식클래스에서 강제 구현
    }
}
