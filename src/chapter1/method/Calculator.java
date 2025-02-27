package chapter1.method;

public class Calculator {

    // 메서드 선언 : 두 수를 더하다

    // 반환값이 있는 메서드 :  return을 통해 반환데이터 표현
    int sum (int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    // 반환값이 없을 때, 반환자료형 위치에 void
    void sum2 (int value1, int value2) {
        int result = value1 + value2;
        System.out.println();
    }
}
