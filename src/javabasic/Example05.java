package javabasic;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        /**
         * - 세 개의 다른 정수 값들을 비교하여 가장 큰 수와 가장 작은 수를 결정하는 프로그램을 작성하세요.
         *     - 세 개의 다른 정수는 모두 콘솔 입력을 통해 할당합니다.
         */
        Scanner sc = new Scanner(System.in);
        int[] numberArr = new int[3];

        for(int i = 0; i < 3; i++) {
            numberArr[i] = sc.nextInt();
        }

        int maxNumber = numberArr[0];
        int minNumber = numberArr[0];

        for(int i = 1; i < numberArr.length; i++) {
            maxNumber = Math.max(maxNumber, numberArr[i]);
            minNumber = Math.min(minNumber, numberArr[i]);
        }

        System.out.println(maxNumber + "" + minNumber);


//        // 세 개의 정수에서 최대값을 구하는 방법
//            // 최대값을 담을 변수 선언
//        int maxNumber;
//            // 첫번째 입력값과 두번째 입력값을 비교해서 더 큰 값을 최대값을 담을 변수에 할당
//        if(number_1 > number_2) {
//            maxNumber = number_1;
//        } else {
//            maxNumber = number_2;
//        }
//            // 최대값을 담은 변수의 값과, 세번째 입력값을 비교
//        if(maxNumber < number_3) {
//            // 두 수 중 더 큰 값을 최대값을 담은 변수에 할당
//            maxNumber = number_3;
//        }
//
//        int minNumber;
//
//        if(number_1 > number_2) {
//            minNumber = number_2;
//        } else {
//            minNumber = number_1;
//        }
//        if(minNumber > number_3) {
//            minNumber = number_3;
//        }
//
//        // 이제 다 구했음.
//
//        System.out.printf("최대값은 : %d, 최소값은 : %d", maxNumber, minNumber);
    }
}
