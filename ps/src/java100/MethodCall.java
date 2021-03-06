package java100;

public class MethodCall {

    public static void sum(int a) {
        System.out.println(a);
    }

    public static void sum2(int[] b) {
        System.out.println(b);
    }

    // new의 역할
    // 새로운 객체를 생성하는데, 갖고있는 값은 주소값!

    public static void main(String[] args) {
        int a = 100; // 값을 보냄 value
        int[] b = new int[5]; // 주소값을 보냄 reference
        sum(a);
        sum2(b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
