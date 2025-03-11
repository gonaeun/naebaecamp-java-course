package chapter2.polymorphism;

public class Main {
    public static void main(String[] args) {
        // 다형성 활용
        // 상위계층의 데이터 타입(Animal)으로 고양이를 담아주기
        // 한가지 데이터 타입으로 하위객체들을 활용 >> 다형성!
        // Cat cat = new Cat();
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.exist();
        animal1.makeSound();

        animal2.exist();
        animal2.makeSound();

        // 업캐스팅 주의사항
        // 자식 클래스의 고유 기능을 사용할 수 없음
//        animal1.scratch();
//        animal2.wag();

        // 다운캐스팅 예시1 (데이터 손실이 일어나기 때문에 명시적형변환 필요)
        long bigBox = 1;
        int smallBox = (int) bigBox;

        // 다운캐스팅 예시2
        Cat cat = (Cat) animal1;
        cat.scratch();
        Dog dog = (Dog) animal2;
        dog.wag();

        // 잘못된 다운캐스팅 문제
//        Cat cat2 = (Cat) animal2;  // animal2 = Dog;
//        cat2.scratch(); // 컴파일러 단계에서는 감지 못함 but 실행시 오류 (ClassCastException)

        // 해결책 : 다운캐스팅시 instanceof 활용
        if (animal2 instanceof Cat) {
            Cat cat2 = (Cat) animal2;
            cat2.scratch();
        } else {
            System.out.println("객체가 고양이가 아닙니다");
        }

        // 다형성의 장점
        Animal[] animals = {new Cat(), new Dog(), new Cat()};
        System.out.println("::::");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
