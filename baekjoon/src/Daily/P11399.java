package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");

        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = strToInt(str[i]);
        }

        Arrays.sort(arr);

        int waitingTime = 0;
        int totalTime = 0;

        for (int i = 0; i < N; i++) {
            waitingTime += arr[i];
            totalTime += waitingTime;
        }
        System.out.println(totalTime);
    }

    public static int strToInt(String str) {
        return Integer.parseInt(str);
    }
}
