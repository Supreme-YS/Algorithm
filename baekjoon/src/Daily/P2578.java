package Daily;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class P2578 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        // 빙고판
        int[][] map = new int[5][5];
        int[][] callMap = new int[5][5];

        // 빙고 카운트 변수
        int bingo = 0;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5 ; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 사회자가 부르는 빙고 숫자 변수
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                callMap[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static boolean findBingo(int num, int cnt) {
        for(int i = 0 ; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            }
        }
    }
}
