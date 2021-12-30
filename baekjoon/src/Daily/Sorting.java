/* 2750번 수 정렬하기  */
package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int temp = 0;

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int k=0; k<N; k++) {
            for (int j=0; j<arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int j=0; j<arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
