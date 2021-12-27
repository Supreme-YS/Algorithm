package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            System.out.println(repeater(R, S));
        }
    }

    public static String repeater(int R, String S) {
        String result = S;

        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < R; j ++) {
                result += result.charAt(i);
            }
        }
        result = result.substring(S.length());
        return result;
    }
}


