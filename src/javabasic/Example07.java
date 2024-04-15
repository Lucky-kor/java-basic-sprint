package javabasic;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        /**
         * 사용자로부터 5명의 학생의 점수를 입력받아 배열에 저장한 다음,
         * 평균 점수를 계산하여 출력하세요.
         */
        int[] arr = new int[5];
        //1. 점수 입력
        Scanner sc = new Scanner(System.in);
        //2. 배열에 할당
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        //3. 평균값 출력
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
//        for(int number: arr) {
//            sum += number;
//        }

        System.out.println(sum / arr.length);
    }
}
