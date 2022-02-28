package java100;

class TestNumber {
    int num;
    // 생성자 : 객체가 생성이 될 때 가장 먼저 실행되는 메서드
    TestNumber(int num) {
        // this.num = num : 이(this) 객체에서 선언한 int num은 TestNumber 메서드에서 인자로 받는 num이다.
        this.num = num;
    }
}

public class MethodCall3 {

    public static void sum(TestNumber a) {
        System.out.println("sum 메서드 내 a = " + a);
    }

    public static void main(String[] args) {

        TestNumber testNumber = new TestNumber(100); // testNumber는 주소값을 갖고 있다.
        sum(testNumber); // 주소값에 의해서 메서드를 호출하고 있다.
        System.out.println("main 메서드 내 a = " + testNumber);

    }
}
