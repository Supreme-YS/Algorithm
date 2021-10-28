package Weekly;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInputNum = input.nextInt(); // 사용자 입력 수
        System.out.println(fact(userInputNum)); // fact 함수에 사용자 입력 수를 넣어 연산한 값을 출력
    }

    public static int fact(int n) { // 매개변수 n
        if (n <= 1) { // 1보다 작을 때 1 리턴
            return n;
        }
        else {
            return fact(n-1) * n; // n * fact(n-1)
        }
    }
}
