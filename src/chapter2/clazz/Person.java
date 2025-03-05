package chapter2.clazz;

public class Person {
    // 클래스의 구조
    // 1. 속성 : 변수 선언으로 표현
    String name;
    int age;
    String address;

    // 2. 생성자 = 조립설명서
    // 생성자가 없으면 클래스를 객체화 시킬 수 없지만, 클래스를 생성하면 기본 생성자는 자동으로 추가되므로 일단 가능!
    // 기본 생성자 : Person() {}
    // 생성자를 정의하면 기본 생성자는 제거됨 (오류발생. 정의한 생성자대로 조립해줘야해)
    // 생성자의 특징 :
    // 1. 클래스와 이름이 같다
    // 2. 반환 타입이 존재하지 않음
    // 3. 여러개가 존재할 수 있음
    Person(String name, int age) {
        // this 는 객체 자신. 현재 실행중인 객체.
        this.name = name;
        this.age = age;
    }

    // 3. 기능 = 메서드 부분
    int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    // 게터 : 속성을 가져오는 기능
    String getName() {
        return this.name;
    }

    // 세터 : 속성을 설정해주는 기능
    void setAddress(String address) {
        this.address = address;
    }
}
