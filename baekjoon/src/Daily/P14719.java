package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14719 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        boolean[][] map = new boolean[height][width];

        // Blocks 입력 처리
        for (int col = 0; col < width; col++) {
            int b = Integer.parseInt(st.nextToken());
            for (int row = 0; row < b; row++) {
                map[height - row - 1][col] = true;
            }
        }

        // 결과 처리 부분

        int result = 0;

        for (int row = 0; row < height; row++) {
            int left = 0;
            boolean flag = false;

            for (int col = 0; col < width; col++) {
                if (map[row][col]) {
                    if (flag) {
                        result += col - left - 1;
                    } else {
                        flag = true;
                    }
                    left = col;
                }
            }
        }
        System.out.println(result);
    }
}
