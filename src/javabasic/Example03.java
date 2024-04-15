package javabasic;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if(isNotDigit(name)) {
            System.out.println("이름에 숫자는 No!");
            return;
        }
        String age = sc.nextLine();
        if(!isDigit(age)) {
            System.out.println("No!");
            return;
        }
        System.out.printf("사용자의 이름은 %s 나이는 %s", name, age);
    }
    public static boolean isNotDigit(String str) {
        String digit = "0123456789";
        for(int i = 0; i <str.length(); i++) {
            if(digit.indexOf(str.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }
     public static boolean isDigit(String str) {
         String digit = "0123456789";
         for(int i = 0; i <str.length(); i++) {
             if(digit.indexOf(str.charAt(i)) == -1) {
                 return false;
             }
         }
         return true;
     }
}
