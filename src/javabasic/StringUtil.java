package javabasic;

public class StringUtil {
    /**
     * - **`reverse`**: 하나의 **`String`**을 매개변수로 받아
     * 그 문자열을 뒤집은 결과를 반환합니다.
     * - **`concat`**: 두 개의 **`String`**을 매개변수로 받아
     * 이를 연결한 결과를 반환합니다.
     * - **`contains`**: 하나의 **`String`**과 하나의 문자를 매개변수로 받아
     * , 주어진 문자열이 해당 문자를 포함하는지 여부를 반환합니다.
     */
    public static String reverse(String str) {
        String reverseString = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i);
        }

        return reverseString;
    }

    public static String concat(String str1, String str2) {
        return str1 + str2;
    }

    public static String concat(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

    public static boolean contains(String str, char c) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                return true;
            }
        }

        return false;
    }

    public static boolean contains(String str1, String str2) {
        for(int i = 0; i <= str2.length() - str1.length(); i++) {
            boolean currentStringisEqual = true;
            for (int j = i; j < i + str1.length(); j++) {
                if (str2.charAt(j) != str1.charAt(j - i)) {
                    currentStringisEqual = false;
                }
            }
            if(currentStringisEqual) return true;
        }
        return false;
    }
}
