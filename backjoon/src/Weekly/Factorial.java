package Weekly;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInputNum = input.nextInt();
        System.out.println(fact(userInputNum));
    }

    public static int fact(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fact(n-1) * n;
        }
    }
}
