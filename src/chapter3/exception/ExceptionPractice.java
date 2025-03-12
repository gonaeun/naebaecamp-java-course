package chapter3.exception;

public class ExceptionPractice {

    // 1. 언체크 예외 호출 예시
    public void callUncheckedException() {
        if (true) {
            System.out.println("언체크 예외 발생");
            throw new RuntimeException();  // 컴파일러가 오류 체크 안해줌
        }

    // 메서드 내부에서 예외처리하는 경우
//        try {
//            if (true) {
//                System.out.println("언체크 예외 발생");
//                throw new RuntimeException();
//            }
//        } catch (RuntimeException e) {
//            System.out.println("언체크 예외 처리");
//        } // 예외가 있어도 try-catch문 덕분에 프로그램이 종료되지않고 정상 흐름으로 돌아감
    }

    // 2. 체크 예외 호출 예시
    public void callCheckedException() throws Exception{
        if (true) {
            System.out.println("체크 예외 발생");
            throw new Exception();
        }
//        try {
//            if (true) {
//                System.out.println("체크 예외 발생");
//                throw new Exception();  // 컴파일러가 오류 체크해줌(빨간밑줄)
//            }
//        } catch (Exception e) {
//            System.out.println("체크 예외 처리");
//        }

    }
}
