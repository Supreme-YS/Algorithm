package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5597 {
    public static void main(String[] args) throws IOException {

        // 카운팅 정렬
        boolean[] booleans = new boolean[31];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 28; i ++) {
            int n = Integer.parseInt(br.readLine());
            booleans[n] = true;
        }

        for (int j = 1; j < booleans.length; j++) {
            if (!booleans[j]) {
                System.out.println(j);
            }
        }
    }
}
