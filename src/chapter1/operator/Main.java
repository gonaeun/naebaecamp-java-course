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


        // 증감 연산자
        num = 1;
        num++;  // 2
        num++;  // 3
        num--;  // 2
        num--;  // 1
        System.out.println("num = " + num);

        // 전위 연산 (++i) : 연산 후 값이 활용됨
        int intBox = 5;
        System.out.println("(++intBox) = " + (++intBox));  // 6

        // 후위 연산 : 값을 활용한 후 연산함
        int intBox2 = 5;
        System.out.println("(intBox2++) = " + (intBox2++)); // 5 // 5라고 출력한 다음에 intBox2의 값이 6이 됨
        System.out.println("intBox2 = " + intBox2); // 6

        // 비교 연산자
        // 같음연산자(=) : 같으면 true, 다르면 false
        System.out.println("10 == 10 : " + (10 == 10));  // true

        // 다름 연산자(!=) : 다르면 true, 같으면 false
        System.out.println("10 != 5 : " + (10 != 5)); // true

        // 크기비교연산자
        System.out.println("10 < 5 : " + (10 < 5));  // false
        System.out.println("10 >= 10 : " + (10 >= 10));  // true
        System.out.println("10 <= 5 : " + (10 <= 5));  // false

        // 논리 연산자
        // AND 연산(&&) : 두 조건이 모두 참일떄, true를 반환
        System.out.println("true && true : " + (true && true)); // true

        int age = 20;
        boolean isStudent = true;
        System.out.println((age>18) && isStudent);  // true

        // OR 연산자(||) : 두 조건 중 하나라도 참이라면 true를 반환
        System.out.println("false || true : " + (false || true)); // true

        // NOT 연산자(!) : true를 false로, false를 true로 바꾸어 줌
        System.out.println("!true : " + (!true));

        // 기본 연산자 우선순위 : 산술 > 비교 > 논리 > 대입
        boolean flag = 10 + 5 > 12 && true;
        // 실행순서
        // 산술 10 + 5
        // 비교 15 > 12
        // 논리 true && true
        // 대입 flag = true
        // 괄호를 적극적으로 활용하자

        // 논리 연산자 우선순위 (! > && > ||)
        boolean result = true || false && false;
        System.out.println("result = " + result);

        boolean result2 = true || false && (!false);
        System.out.println("result2 = " + result2);

        // 문자열 비교
        String text = "hello";
        String text2 = "Hello";
        // 나쁜 예 : (text == text2)
        // ==는 메모리 주소를 비교하는 방식이므로 문자열 비교할 때 사용x
        boolean isEqual = text.equals(text2);
        System.out.println("isEqual = " + isEqual);

    }
}
