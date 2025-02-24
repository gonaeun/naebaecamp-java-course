package chapter1.io;

import java.util.Scanner;

public class UserInfoPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String userName = scanner.nextLine();

        System.out.print("나이을 입력하세요 : ");
        int userAge = scanner.nextInt();

        System.out.println("출력 결과 : ");
        System.out.println("이름 : " + userName);
        System.out.println("나이 : " + userAge);
    }

}
