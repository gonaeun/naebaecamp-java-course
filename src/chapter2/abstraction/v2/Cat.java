package chapter2.abstraction.v2;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("야옹!");
        // 상속은 고양이에 맞게 재정의 가능
    }
    public void scratch() {
        System.out.println("스크래치");
    }
}
