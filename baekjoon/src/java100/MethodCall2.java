package java100;

public class MethodCall2 {

    public static void sum(Integer a) {
        System.out.println("a = "  + a);
    }

    // Wrapper 클래스를 사용하는 방법
    public static void main(String[] args) {
        Integer a = new Integer(100);
        sum(a);
        System.out.println("a = " + a);

    }

    // Wrapper 클래스를 좀 더 공부해보자.
}
