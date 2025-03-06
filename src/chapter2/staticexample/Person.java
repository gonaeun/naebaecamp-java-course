package chapter2.staticexample;

public class Person {

    // 인스턴스 변수
    String name;

    // static 변수
    static int population = 0;

    Person() { // 생성자
        population++; // 생성자가 호출될 때마다 증감연산자 작동
    }

    // 인스턴스 메서드
    void printName(){
        System.out.println("나의 이름은 "+this.name+"입니다.");
    }

    // static 메서드
    static void printPopulation() {
        System.out.println("현재 인구 수 : " + population);
    }
}
