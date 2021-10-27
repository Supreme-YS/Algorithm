package Step3;

import java.util.Scanner;

public class Hap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        for (int i = 1; i < testCase; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            System.out.println("Case #"+i+": "+(a+b));
        }
        input.close();
    }
}
