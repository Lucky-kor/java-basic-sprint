package javabasic;

public class Example09 {
    public static void main(String[] args) {
        /**
         * Person 클래스를 생성하고,
         * 이름(name)과 나이(age)를 필드로 가지게 하세요.
         * 해당 클래스에는 이름과 나이를 설정할 수 있는 생성자와,
         * 이를 출력할 수 있는 메서드를 포함하세요.
         */
        Person jungmin1 = new Person("jungmin", 30);
        Person jungmin2 = new Person("jungmin", 30);
        System.out.println(jungmin1);
        System.out.println(jungmin2);
        jungmin1.name = "minjung";
        System.out.println(jungmin1.name);
        System.out.println(jungmin2.name);
//        System.out.println(jungmin.name);
//        System.out.println(jungmin.age);
//        jungmin.introduce();
//

    }
}
