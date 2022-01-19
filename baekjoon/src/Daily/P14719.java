package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14719 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        boolean[][] map = new boolean[h][w];

        //입력 처리
        for (int c = 0; c < w; c++) {
            int b = Integer.parseInt(st.nextToken());
            for (int r = 0; r < b; r++) {
                map[h - r - 1][c] = true;
            }
        }

        int result = 0;

        for (int r = 0; r < h; r++) {
            int left = 0;
            boolean flag = false;

            for (int c = 0; c < w; c++) {
                if (map[r][c]) {
                    if (flag) {
                        result += c - left - 1;
                    } else {
                        flag = true;
                    }
                    left = c;
                }
            }
        }
        System.out.println(result);
    }
}
