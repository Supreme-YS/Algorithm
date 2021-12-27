package Daily;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cnt = input.nextInt();
        int[] numbers = new int[cnt];

        for (int i=0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        input.close();
        Arrays.sort(numbers);
        System.out.print(numbers[0] + " " + numbers[cnt-1]);
    }
}
