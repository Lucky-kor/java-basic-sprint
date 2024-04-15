package javabasic;

public class Example10 {
    public static void main(String[] args) {
        /**
         * Book 클래스를 만들고,
         * 제목(title), 저자(author), 가격(price)을 필드로 정의하세요.
         * 모든 필드를 초기화하는 생성자와,
         * 필드 값을 출력하는 메서드를 포함하세요.
         */

        Book book = new Book("객체지향의 사실과 오해", "조영호", 10000);
        System.out.println(book.price);
        book.price = 12000;
        book.printPrice();
    }
}
