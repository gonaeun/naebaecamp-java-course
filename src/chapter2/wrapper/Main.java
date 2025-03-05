package chapter2.wrapper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 기본형 변수
        int a = 1;
        System.out.println("a =  " + a);

        // 참조형 변수
        Person person = new Person();
        System.out.println("person = " + person);
        // person = chapter2.wrapper.Person@5b6f7412
        // @5b6f7412는 Heap영역에 대한 메모리의 주소값
        int[] arr = {1,2,3,4,5};
        System.out.println("arr = " + arr);
        // arr = [I@27973e9b
        // 배열도 참조형 변수!

        // 래퍼 클래스 : 기본형 변수를 감싸고 있는 클래스
        // 참조형 변수입니다.
        Integer num = 100;
        System.out.println("num = " + num);
        // 참조형 변수이지만 출력시 주소값이 나오지 않음 (자주 사용하니까 내부적으로 처리가 되어서)

        // 객체는 기능을 제공하지만, 기본형은 속성, 기능을 가지지 않음
        // 기본형을 감싼 객체를 만들면(=래퍼 클래스) 기능을 제공할 수 있음
        // 예) toString() : 정수형 데이터를 문자형 데이터로 바로 변경해주는 기능
        String numStr = num.toString();
        System.out.println("numStr = " + numStr);

        // 직접 만든 래퍼클래스
        Custominteger myInteger = new Custominteger(10);
        String myStrInteger = myInteger.toString();


        // 오토박싱 : 기본형->래퍼형
        Integer num3 = 10;
        // ctrl 누르고 Integer 위에 커서 올리면 기능 확인할 수 있음
        // Integer num3 = Integer.valueOf(10); 생성자를 불러오는 기능이 내부적으로 자동처리되어있음을 확인.

        // 오토언박싱 : 래퍼형->기본형
        int num4 = num3;
        // 참조형을 기본형에 대입
        // int a = num.intValue(); 내부적으로 자동처리됨
    }
};
