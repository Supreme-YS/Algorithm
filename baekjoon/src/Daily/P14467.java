package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P14467 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Map<Integer, Integer> cows = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int cowNum = Integer.parseInt(st.nextToken());
            int locValue = Integer.parseInt(st.nextToken());

            if (cows.containsKey(cowNum)) {
                if (cows.get(cowNum) != locValue) {
                    cnt++;
                }
            }
            cows.put(cowNum, locValue);
        }
        System.out.println(cnt);
    }
}
