package Step5;

import java.io.IOException;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[sc.nextInt()];
        double total = 0;
        double average = 0;

        for (int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int j=0; j < arr.length; j++) {
            arr[j] = arr[j] / (arr[arr.length-1]);
            total = arr[j] + total;
            average = total / arr.length;
        }
        System.out.println(average * 100);
    }
}

