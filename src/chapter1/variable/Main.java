package chapter1.variable;

public class Main {

    public static void main(String[] args) {
        // 자동완성 : main 엔터

        // 변수의 형식
        // [자료형] [변수이름];

        // 정수형
        int a; // 선언
        a = 1; // 할당
        a = 2;
        System.out.println("a = " +a);
        // 자동완성 : sout 엔터

        // 논리형
        boolean booleanBox = true;
        booleanBox = false; // 재할당
        System.out.println("booleanBox = " + booleanBox);

        // 문자형
        char charBox = 'a';  // 문자형에는 문자 하나만. 'ab';는 에러뜸
        charBox = 'b';
        System.out.println("charBox = " + charBox);

        // 큰 정수형
        long longBox = 1;
        longBox = 2;
        System.out.println("longBox = " + longBox);

        // 실수형
        float floatBox = 0.12345678f;  // 0.12345678
        floatBox = 0.1234567890f; // 0.12345679 (큰 데이터를 다 못담아냄)
        // 소수점을 입력하면 java는 double형을 기본으로 인식하기 때문에, float를 쓰려면 f를 붙여줘야함.
        // float는 소수점 6~7자리. double은 소수점 15~17자리까지 담아냄
        System.out.println("floatBox = " + floatBox);

        double doubleBox = 0.1234567890;
        System.out.println("doubleBox = " + doubleBox);

        // 캐스팅(Casting)
        // 다운캐스팅 : 큰 데이터를 작은 상자에 (명시적 변환)
        double bigBox = 10.123;
        int smallBox = (int) bigBox;
        System.out.println("smallBox = " + smallBox);

        // 업캐스팅 : 작은 데이터를 큰 상자에
        int smallBox2 = 10;
        double bigBox2 = smallBox2;
        System.out.println("bigBox2 = " + bigBox2);

        // 문자열 데이터
        // 큰따옴표와 작은따옴표 구분하기
        char a1 = 'a';
        String str = "안녕하세요!";
    }
}
