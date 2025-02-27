package chapter1.loop;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        // 입력한 숫자의 구구단 출력하기
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 구구단 단수를 입력하세요 (2~9) :");
        int number = scanner.nextInt();

        while (number > 1 && number <= 9) {  // 2~9 사이의 숫자인지 확인
            System.out.println("====" + number + "단" + "====");
            for (int i = 1; i < 10; i++) {
                System.out.println(number + " x " + i + " = " + number * i);
            } break;
        }
    }
}
