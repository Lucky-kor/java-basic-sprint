package javabasic;

public class Example08 {
    public static void main(String[] args) {
        /**
         * 주어진 정수 배열에서 최댓값과 최솟값을
         * 찾아 출력하는 프로그램을 작성하세요.
         */
        fineMaxMinNumber(new int[]{1, 3, 5, 7, 9});
        fineMaxMinNumber(new int[]{-1, -3, -99, -28273});
    }

    public static void fineMaxMinNumber(int[] arr) {
        int max = arr[0];
        int min = arr[0];
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;

        for (int j : arr) {
            if (max < j) {
                max = j;
            }
            max = max < j ? j : max;
            max = Math.max(max, j);
            if (min > j) {
                min = j;
            }
        }

        System.out.printf("최대값은 : %d, 최소값은 : %d%n", max, min);
    }
}
