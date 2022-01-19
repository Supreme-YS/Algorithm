package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14719 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        Boolean[][] map = new Boolean[H][W];

        String[] blocks = br.readLine().split(" ");

        // blocks의 length는 어차피 W의 값과 같음
        // W로 치환이 가능
        for (int j = 0; j < blocks.length; j++) {
            int blockIndex = Integer.parseInt(blocks[j]);
            for (int i = 0; i < blockIndex; i++) {
                map[i][j] = true;
            }
        }

        int result = 0;
        for (int j = 0; j < blocks.length; j++) {
            int blockIndex = Integer.parseInt(blocks[j]);
            for (int i = 0; i < blockIndex; i++) {
                int temp = 0;
                for (int k = j + 1; k < W; k++) {
                    if (!map[i][k]) {
                        temp++;
                    } else {
                        result += temp;
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
