package Daily;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int result[] = new int[n];

        int count;

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            count = 1;
            for (int j = 0; j < num.length; j++) {
                if (num[i] < num[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        Arrays.stream(result).forEach((s) -> System.out.print(s + " "));
    }
}