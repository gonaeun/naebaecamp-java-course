import chapter1.MyNewClass; // new MyNewClass();를 입력하면 어느 패키지에 정의된 파일인지 명시됨

public class Main {
    // 모든 것이 class(객체)로 이루어짐 >> Java는 객체지향적!

    public static void main(String[] args) {
        // (주석) 코드에 대한 설명 작성
        System.out.println("Hello, Java!");

        new MyNewClass(); // 패키지 활용 방법
    }
}
