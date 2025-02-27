package chapter1.loop;

public class Gugudan2 {
    public static void main(String[] args) {
        // 전체 구구단 출력하기 (중첩for문 활용)

        for (int i = 2; i <= 9; i++) {
            System.out.println("==== "+ i + "단 ====");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i * j );
            }
            System.out.println();
        }

    }
}
