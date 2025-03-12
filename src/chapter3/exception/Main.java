package chapter3.exception;

public class Main {

    public static void main(String[] args) {

        // 1. 의도하지 않은 에외 : 문법적인 오류는 없지만 연산 실행시 발생하는 예외
//        int ret = 10/0;
//        System.out.println("프로그램 종료");

        // 2. 의도적인 예외 (throw 사용해서 의도적으로 예외를 발생시킴)
//        int age = 10;
//        if (age < 18) {
//            throw new IllegalArgumentException("미성년자는 접근할 수 없습니다.");
//        }
        // 의도한 예외를 제때 처리해주지 않으면 비정상적으로 프로그램 종료됨
//        System.out.println("프로그램 종료");  // 실행 안 됨

        // 3. 언체크 예외 호출
        ExceptionPractice exceptionPractice = new ExceptionPractice();
        // main에서 예외처리하는 경우
//        try {
//            exceptionPractice.callUncheckedException();
//        } catch (RuntimeException e) {
//            System.out.println("언체크 예외 처리");
//        }

        // 4. 체크 예외 호출
        try {
            exceptionPractice.callCheckedException();
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }


        System.out.println("프로그램 종료"); // 이전코드에서 예외처리되야 실행될 수 있음
    }
}
