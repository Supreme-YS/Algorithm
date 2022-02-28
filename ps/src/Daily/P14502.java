package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14502 {

    static class Virus {
        int x, y;

        public Virus(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    // 지도의 세로 크기
    static int N;
    // 지도의 가로 크기
    static int M;

    static int[][] map;
    static int[][] copyMap;

    // 상, 하, 좌, 우
    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { 1, -1, -1, 1 };

    static int result = Integer.MIN_VALUE; // 안전지역 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        map = new int[N][M];
        copyMap = new int[N][M];

    }


}
