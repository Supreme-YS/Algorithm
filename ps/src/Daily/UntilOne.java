package Daily;

import java.util.*;
import java.io.*;

public class UntilOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 0;

        while (N > 1) {
            if (N % K == 0) {
                N = N / K;
                cnt++;
            } else {
                N = N - 1;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
