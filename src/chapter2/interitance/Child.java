package chapter2.interitance;

public class Child extends Parent{
    public String familyName = "gonaeun";

    public Child() {
        // 부모가 자식보다 먼저 생성되어야 하므로, super는 생성자의 첫줄에 위치
        super();
        System.out.println("자식 생성자");
    }
    public void superTest() {
        System.out.println(super.familyName);
    }

    public void showSocialMedia() {
        System.out.println("SNS에서 우리 가문을 소개해드립니다");
    }

    @Override
    public void introduceFamily() {
        System.out.println("오버라이드");
    }
}
