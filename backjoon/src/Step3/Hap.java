package Step3;

import java.util.Scanner;

public class Hap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt, a, b;
        cnt = input.nextInt();

        for (int i=0; i < cnt; i++){
            a = input.nextInt();
            b = input.nextInt();
            System.out.println(a + b);
        }

    }
}
