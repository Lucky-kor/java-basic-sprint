package javabasic;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        /***
         * - 사용자로부터 두 개의 숫자를 입력받아, 이들에 대한 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
         *     - 두 개의 숫자는 모두 double타입의 값입니다. 결과값도 double타입을 반환해야 합니다.
         *     - 나눗셈에서 0으로 나눌 경우 나눌 수 없는 수라는 예외 메시지를 출력해야 합니다.
         *
         */

        // 1. 두개의 숫자를 입력 받아야 합니다.
            // 1-1 스캐너 객체 선언 할당
        Scanner sc = new Scanner(System.in);
            // 1-2 입력 받을 값을 할당할 변수 2개 선언
        double leftNumber;
        double rightNumber = 0.0;
            // sc.nextDouble() or nextLine() 으로 입력값을 받아서 변수에 할당
        System.out.println("첫 번째 숫자를 입력해 주세요. 소수점 15자리까지 입력이 가능합니다.");
        leftNumber = sc.nextDouble();
        System.out.println("두 번째 숫자를 입력해 주세요. 소수점 15자리까지 입력이 가능합니다.");
        rightNumber = sc.nextDouble();
        // 2. 사칙 연산을 하여 값을 출력해야 합니다.
            // 2-1 더하기 값 출력
        System.out.printf("%f 더하기 %f는 : %f%n", leftNumber, rightNumber, leftNumber + rightNumber);
            // 2-2 빼기 값 출력
        System.out.printf("%f 빼기 %f는 : %f%n", leftNumber, rightNumber, leftNumber - rightNumber);
            // 3-3 곱하기 값 출력
        System.out.printf("%f 곱하기 %f는 : %f%n", leftNumber, rightNumber, leftNumber * rightNumber);
            // 3-4 나누기 값 출력
        if(rightNumber == 0.0) {
            System.out.println("0으로 나눌 수 없습니다. 휴먼");
        } else {
            System.out.printf("%f 나누기 %f는 : %f%n", leftNumber, rightNumber, leftNumber / rightNumber);
            // 나누는 숫자(두번째 입력 값)이 0이라면 예외 메시지 발생 후 종료
        }
    }
}
