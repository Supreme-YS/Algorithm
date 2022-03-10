package java100;

class Persons {
    // 속성
    int age;
    String name;

    // 생성자
    Persons() {};
    Persons(int age, String name) {
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
        Persons p1 = new Persons(20, "홍길동");
        p1.printPerson();
        System.out.println(p1.age);
        System.out.println(p1.name);

        Persons p2 = new Persons(30, "슈프림");
        p2.printPerson();
        System.out.println(p2.age);
        System.out.println(p2.name);
    }
}
