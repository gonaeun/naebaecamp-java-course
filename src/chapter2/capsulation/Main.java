package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {

        // 생성자 호출
        Person person = new Person();

        // 인스턴스 변수 접근
        person.name = "gonaeun";
//        person.secret = "??" //private 이라서 접근 안됨

        // 인스턴스 메서드 접근
        person.methodA();
//        person.methodB(); //private 이라서 접근 안됨

        // 게터
        String name = person.getName();
        System.out.println("이름 : "  + name);

        // 세터
        person.setName("hanni"); // 인스턴스 변수에 대한 값을 변경하고 싶을 때 세터 사용
        String name2 = person.getName();
        System.out.println("이름 : " + name2);
    }
}
