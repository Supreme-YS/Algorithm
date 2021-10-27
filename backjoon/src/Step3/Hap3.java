package Step3;

import java.util.Scanner;

public class Hap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i=1; i <= count; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;

            System.out.printf("Case #"+i+": "+"%d + %d = %d", a, b, sum);
        }
    }
}
