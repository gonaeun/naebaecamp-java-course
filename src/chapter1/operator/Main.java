package chapter1.operator;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 기본적인 사칙연산
        int sum = a + b;
        System.out.println("sum = " + sum);

        int sub = a - b;
        System.out.println("sub = " + sub);

        int mul = a * b;
        System.out.println("mul = " + mul);

        // 나눗셈
        // 10/3
        int div = a / b;
        System.out.println("div = " + div);  // 3
        // 정수끼리 나누면 소수점이 버려지고

        // a/3.0
        double div2 = a / 3.0;
        System.out.println("div2 = " + div2);  // 3.3333333333333335
        // 소수점을 유지하려면 소수점과 연산을 시켜야함

        // 모듈러 연산자(나머지 연산) : %
        int mod = 10 % 3;
        System.out.println("mod = " + mod);

        int mod2 = 15 % 4;
        System.out.println("mod2 = " + mod2);

        int mod3 = 20 % 7;
        System.out.println("mod3 = " + mod3);

        // 모듈러 연산의 활용1 : 시간 연산
        int mod4 = (10 + 5) % 12;
        System.out.println("mod4 = " + mod4);

        // 모듈러 연산의 활용2 : 짝수 홀수 연산
        int mod5 = 6 % 2;
        System.out.println("mod5 = " + mod5);  // 0이 나오면 짝수

        int mod6 = 7 % 2;
        System.out.println("mod6 = " + mod6);  // 1이 나오면 홀수

        // 대입 연산자 : 변수에 값을 할당
        int num = 5;

        // 복합 대입 연산자 : 누적 값을 구할 때
        num += 3;   // num = num + 3;
        System.out.println("num = " + num);

        num -= 2;   // num = num - 2;
        System.out.println("num = " + num);

        num *= 2;   // num = num * 2;
        System.out.println("num = " + num);

        num /= 3;   // num = num / 3;
        System.out.println("num = " + num);

        num %= 3;   // num = num % 3;
        System.out.println("num = " + num);
    }
}
