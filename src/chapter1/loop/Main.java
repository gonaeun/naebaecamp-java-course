package chapter1.loop;

public class Main {
    public static void main(String[] args) {

        // 2번째 손님에게만 인사 안하기!
        int custommers = 5;
        for (int i = 1; i < custommers; i++) {
            if (i == 4) {
                break;  // 루프 탈출
            }
            if (i == 2) {
                continue;  // 루프 안에서 하나의 반복을 스킵
            }
            System.out.println(i + "번째 손님, 안녕하세요!");
        }
    }
}
