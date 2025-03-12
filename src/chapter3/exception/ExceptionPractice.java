package chapter3.exception;

public class ExceptionPractice {

    // 1. 언체크 예외 호출 예시
    public void callUncheckedException() {
    // 메서드 내부에서 예외처리하는 경우
//        try {
            if (true) {
                System.out.println("언체크 예외 발생");
                throw new RuntimeException();
            }
//        } catch (RuntimeException e) {
//            System.out.println("언체크 예외 처리");
//        } // 예외가 있어도 try-catch문 덕분에 프로그램이 종료되지않고 정상 흐름으로 돌아감
    }

    // 2. 체크 예외 호출 예시
}
