package Daily;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(plus(a, b));
        System.out.println(minus(a, b));
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));
        System.out.println(remainder(a, b));
    }

    static int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static float remainder(int a, int b) {
        float f = a % b;
        return f;
    }
}
