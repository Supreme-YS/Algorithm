package java100;

class Person {
    // Field
    int gender;
    int power;

    // Constructor
    Person() {
        this.gender = 1; // 1 : 남성, 2 : 여성
        this.power = 100;// 기본 파워 : 100
    }

    // Method
    void walk() {
        System.out.println("걸어가고 있다.");
    }
}

class Hero extends Person {
    // Field
    String name;
    int age;
    // Constructor
    Hero() {
    }
    Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Method
    void walk() {
        System.out.println("2배로 빠르게 걸어가고 있다.");
    }
    void eat() {
        System.out.println("밥을 먹고 있다.");
    }
    void displayPerson() {
        System.out.println("이름 = " + name + " 나이 = " + age + " 성별 = " + gender + " 파워 = " + power);
    }
}

class Villain {

}


public class Java100_oop_InheritanceSample {
    public static void main(String[] args) {

    }
}
