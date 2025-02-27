package chapter1.array;

public class arrayTest {
    public static void main(String[] args) {
        // 1차원 배열에서 짝수만 출력하기
        int[] a = {3,4,7,10,15,20};

        System.out.print("짝수 : ");
        for (int i = 0; i<a.length; i++) {
            if(a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
