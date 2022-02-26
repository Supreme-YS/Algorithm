package java100;

public class ThreeOperation {
    public static void main(String[] args) {

        // 만약에 age가 20보다 작거나 같다면 age에 100을 곱한 값을 출력하라.

        int age = 20;

        int result = age <= 20 ? age * 100 : age;

        System.out.println("result = " + result);

        // 12시 보다 작으면 오전, 12시보다 크면 오후를 삼항연산자를 사용해서 만들어라

        int time = 11;

        String value = time < 12 ? value = "오전" : "오후";

        System.out.println("value = " + value);
    }
}
