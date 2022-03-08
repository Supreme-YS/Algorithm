package java100;

class Person {
    // 속성
    int age;
    String name;

    // 생성자
    Person() {};
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    };
    // 메서드
    void printPerson() {
        System.out.println("나이 = " + age + "이름 = " + name);
    }
}

public class Java100_oop_Exam006 {
    public static void main(String[] args) {
        
        // 객체 생성
        Person p1 = new Person(20, "홍길동");
        p1.printPerson();
        System.out.println(p1.age);
        System.out.println(p1.name);
    }
}
