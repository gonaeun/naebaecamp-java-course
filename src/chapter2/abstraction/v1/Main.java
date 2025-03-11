package chapter2.abstraction.v1;

public class Main {
    public static void main(String[] args) {
        // 인터페이스를 통한 추상화 상속
        Cat cat = new Cat();
        cat.exist();
        cat.makeSound();
        cat.scratch();
    }
}
