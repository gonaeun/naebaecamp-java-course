package chapter2.capsulation;

public class Person {

    // 속성
    public String name;
    private String secret;

    // 생성자
    public Person() {}
//    private Person() {}
    // private 접근제어자(접근제어범위 : 같은 클래스) >> main에서 호출 오류
//    Person() {}
    // 접근제어자를 명시하지 않으면 >> 기본 접근제어자는 default(접근제어범위 : 패킺지 내부)

    // 속성들을 private으로 설정해두고 생성자를 public으로 열어두면 매개변수를 통해 생성시점에 한번에 설정하므로 더욱 효율적
    public Person(String name, String secret) {
        this.name = name;
        this.secret = secret;
    }

    // 기능
    public void methodA() {}
    private void methodB() {}

    // 게터
    public String getName() {
        return name;
    }

    // 세터
    public void setName(String name) {
        this.name = name;
    }
}
