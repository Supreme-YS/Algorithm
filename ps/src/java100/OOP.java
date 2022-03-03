package java100;

class FarmMachine {
    // [1] : 특징 : 속성
    int price;
    int year;
    String color;

    // [2] : 동작 : 메서드
    void move() {
        System.out.println("FarmMachine is moving");
    }

    void dig() {
        System.out.println("FarmMachine is digging");
    }

    void grind() {
        System.out.println("FarmMachine is griding");
    }
}


public class OOP {
    public static void main(String[] args) {

        FarmMachine farmMachine = new FarmMachine();
        // 객체의 주소값이 찍히겠군..
        System.out.println("farmMachine = " + farmMachine);

        // 객체에 속성값 입력하기
        farmMachine.price = 10000;
        farmMachine.color = "red";
        farmMachine.year = 2022;

        // comma로 값 찍히
        String fmPrice = String.format("%,d", farmMachine.price);
        // comma 값 출력
        System.out.println("fmPrice = " + fmPrice);
        // 속성값 출력하기
        System.out.println("farmMachine.price = " + farmMachine.price);
        System.out.println("farmMachine.color = " + farmMachine.color);
        System.out.println("farmMachine.year = " + farmMachine.year);

        // 메서드 호출하기
        farmMachine.move();
        farmMachine.dig();
        farmMachine.grind();
    }
}
