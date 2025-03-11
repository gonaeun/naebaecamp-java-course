package chapter2.abstraction.v2;

public class Main {
    public static void main(String[] args) {
        // 클래스를 통한 추상화 상속
        Cat cat = new Cat();
        cat.exist();
        cat.makeSound();
        cat.scratch();
    }
    // 계층적 구조를 통해 유지보수성이 좋은 프로그램을 만들 수 있음 (생명체에 관한 로직, 동물에 관한 로직, 고양이에 관한 로직 각각 관리)
    // 추상화란? 특정 계층에서 필요한 본질적인 특성만 유지하고 불필요한 세부사항을 숨기는 객체지향의 특징
}
