package Step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RenewHap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int A, B;
        StringTokenizer st;

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine()," "); // 문자열 분리
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
        }
        br.close();
    }
}
