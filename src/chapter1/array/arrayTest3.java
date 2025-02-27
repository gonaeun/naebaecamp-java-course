package chapter1.array;

public class arrayTest3 {
    public static void main(String[] args) {
        // 2차원 배열에서 검은돌(true)의 좌표(x,y)찾기
        boolean[][] board = {
                {true, false},
                {false, true}
        };

        for (int i=0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.println("검은돌(●) 위치 : (" + i + "," + j + ")" );
                }
            }
        }
    }
}
