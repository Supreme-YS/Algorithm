package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1926 {
    public static void main(String[] args) throws IOException {
        /* 입력 부분 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 배열
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 방문 기록을 위한 flag
        boolean[][] visited = new boolean[n][m];

        // 방향 배열 : 오른쪽, 아래, 왼쪽, 위
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        // 그림의 갯수
        int count = 0;
        // 넓이
        int area = 0;
        // 최대 넓이
        int max = 0;
        Queue<Pair> qu = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 시작점이 0이거나 방문한 적이 있으면 pass
                if (arr[i][j] == 0 || visited[i][j] == true) {
                    continue;
                }
                // 시작점이 1이거나 방문한 적이 없는 곳
                // 그림 갯수 추가
                count++;
                // 시작점의 좌표를 큐에 담아준다.
                qu.offer(new Pair(i, j));
                // 방문처리
                visited[i][j] = true;
                // 그림당 면적 초기화
                area = 0;

                // 큐에 값이 없을 때까지 반복
                while (!qu.isEmpty()) {
                    // 좌표값을 꺼낸다.
                    Pair p = qu.poll();
                    // 꺼낼 때 면적을 하나 추가한다.
                    area++;

                    // 방향 탐색    ( 우, 하, 좌, 상 )
                    // int[] dx = {1, 0, -1, 0};
                    // int[] dy = {0, -1, 0, 1};
                    for (int k = 0; k < 4; k++) {
                        //
                        int n_x = p.x + dx[k];
                        int n_y = p.y + dy[k];
                        // 우, 하, 좌, 상 으로 탐색할 때 마다 벽을 체크한다.
                        // 벽이라면 패스한다.
                        if (n_x < 0 || n_x >= n || n_y < 0 || n_y >= m) {
                            continue;
                        }
                        // 탐색하는 도중에 1이거나, 방문하지 않은 곳이라면
                        if (arr[n_x][n_y] == 1 && !visited[n_x][n_y]) {
                            // 새로운 좌표를 담는다.
                            qu.offer(new Pair(n_x, n_y));
                            // 방문처리를 한다.
                            visited[n_x][n_y] = true;
                        }
                    }
                }
                if (area > max) {
                    max = area;
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }
}

// queue에 좌표값을 넣어주기 위한 클래스
class Pair {
    int x, y;

    // 생성자
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getter, setter 생성
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
