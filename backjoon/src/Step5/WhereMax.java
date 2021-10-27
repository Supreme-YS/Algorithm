package Step5;

import java.util.Scanner;

public class WhereMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(), };
        input.close();

        int cnt = 0;
        int max = 0;
        int index = 0;

        for (int value : arr) {
            cnt ++;

            if (value > max) {
                max = value;
                index = cnt;
            }
        }
        System.out.println(max + "\n" + index);
    }
}
