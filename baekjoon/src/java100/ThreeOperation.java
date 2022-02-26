package java100;

public class ThreeOperation {
    public static void main(String[] args) {

        // 만약에 age가 20보다 작거나 같다면 age에 100을 곱한 값을 출력하라.

        int age = 20;

        int result = age <= 20 ? age * 100 : age;

        System.out.println("result = " + result);
    }
}
