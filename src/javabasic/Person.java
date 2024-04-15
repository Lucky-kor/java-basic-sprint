package javabasic;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.printf("제 이름은 %s 제 나이는 %d입니다.%n", name, age);
    }
}
