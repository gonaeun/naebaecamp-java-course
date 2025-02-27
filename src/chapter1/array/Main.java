package chapter1.array;

public class Main {

    public static void main(String[] args) {

        // 1. 배열 선언
        int[] arr;

        // 2. 배열 길이 할당
        arr = new int[5];
        // arr = [] [] [] [] []

        // 3. 배열 선언과 길이 동시에 할당
        int[] arr2 = new int[5];
        // arr = [] [] [] [] []  <- 빈공간

        // 4. 배열 선언과 동시에 배열의 요소 할당
        int[] arr3 = {10, 20, 30, 40, 50};
        // arr = [10] [20] [30] [40] [50]

        // 배열의 길이
        int arr3Length = arr3.length;
        System.out.println("arrLength = " + arr3Length);

        // 반복문으로 배열 탐색
        // 인덱스 사용시 주의할 것
        for (int i = 0; i < arr3Length; i++) {
            System.out.println("인덱스: "+i+", 값: "+arr3[i]);
        }

        // 현업에서 주로 활용하는 "향상된 for 문"
        // arr3 [10] [20] [30] [40] [50]
        for (int a : arr3) {
            System.out.println("값 : " + a);
        }

        // 2차원 배열
        // 1. 배열 선언
        // boolean[][] board = new boolean[2][2];
        // 2. 배열 선언과 할당을 동시에
        boolean[][] board = {
                {true, false}, // 0행의 0열, 0행의 1열,
                {false, true}  // 1행의 0열, 1행의 1열
        };
        System.out.println(board[0][0]); // true
        System.out.println(board[0][1]); // false
        System.out.println(board[1][0]); // true
        System.out.println(board[1][1]); // false
    }
}
