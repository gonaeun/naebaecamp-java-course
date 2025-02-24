package chapter1.io;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 출력 (System 객체 사용)
        // println 사용
        System.out.println("Hello");
        System.out.println("Java");

        // print 사용
        System.out.print("안녕");
        System.out.print("자바"); // 안녕자바

        // println과 print의 차이 : ln은 자동 줄바꿈
        // \n은 개행문자 = 줄바꿈

        // 개행문자 포함 출력
        System.out.println("\nHello\nWorld");

        // 입력 (Scanner 객체 사용)
        // 스캐너 객체를 스캐너형 박스(scanner)에 담음
        // [자료형] [변수이름] = [새로운(new) 객체 소환]
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력받기
        System.out.print("좋아하는 문장을 입력하세요 : ");
        String sentence = scanner.nextLine(); // 입력받은 데이터를 다시 활용하려면 변수에 담아줘야함
        System.out.println("sentence = " + sentence);

        // 정수형(int, long) 입력받기
        System.out.print("정수(int)를 입력하세요 : ");
        int intBox = scanner.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.print("정수(long)를 입력하세요 : ");
        long longBox = scanner.nextInt();
        System.out.println("longBox = " + longBox);

        // 소수점 입력받기
        System.out.print("소수점(double)을 입력하세요 : ");
        double doubleBox = scanner.nextDouble();
        System.out.println("doubleBox = " + doubleBox);

    }
}
