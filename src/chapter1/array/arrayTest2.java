package chapter1.array;

public class arrayTest2 {
    public static void main(String[] args) {
        // 배열의 누적 합을 구하시오
        int[] a = {2, 5, 8};
        int sum = 0;

        for (int i = 0; i<a.length; i++) {
            sum += a[i];
        }

        System.out.println("누적합 : " + sum);
    }
}
