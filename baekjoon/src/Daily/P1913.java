package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1913 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        solution(N, T);
    }

    static void solution(int N, int T) {
        int[][] map = new int[N][N]; // 주어진 길이만큼 배열 생성
        int value = 1; // 시작값 설정

        // 시작 x, y좌표 설정
        // 예. N = 3이라면 (1,1)이 시작
        int x = N / 2;
        int y = N / 2;

        // 벽(wall) 설정
        int limit = 1;

        while (true) {
            for (int i = 0; i < limit; i++) {
                map[y--][x] = value++; // [0][1] = 2 // [1][0] = 8 // [0][0] = 9
            }
            if (value - 1 == N * N) {
                break;
            }

            for (int i = 0; i < limit; i++) {
                map[y][x++] = value++; // [0][2] = 3
            }
            limit++; // limit = 2

            for (int i = 0; i < limit; i++) {
                map[y++][x] = value++; // [1][2] = 4 -> [2][2] = 5
            }

            for (int i = 0; i < limit; i++) {
                map[y][x--] = value++; // [2][1] = 6 // [2][0] = 7
            }
            limit++; // limit = 3
        }

        StringBuilder sb = new StringBuilder();

        int tx = 0, ty = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (T == map[i][j]) {
                    // 목표 숫자의 좌표값 도출을 위함
                    ty = i + 1;
                    tx = j + 1;
                }
                // 지도를 그려나감
                sb.append(map[i][j] + " ");
            }
            sb.append("\n");
        }
        // 목표 숫자의 좌표값 출력
        sb.append(ty + " " + tx);
        System.out.println(sb.toString());
    }
}
