package javabasic;

import java.util.Arrays;

public class Example06 {
    public static void main(String[] args) {
        /**
         * 10개의 정수 값을 저장할 수 있는 배열을 생성하고,
         * 1부터 10까지의 값을 배열에 저장한 후, 이를 출력하세요.
         */
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
