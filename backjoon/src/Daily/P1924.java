package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        /* 1월 1일이 월요일, 1월 31일을 예시로 해보자.
         31 % 7 = 3 이므로 일요일에서 3일 더한 수요일이다.
         즉, 그냥 가볍게 요일별로 일수 두고 해당 월만큼 더해가고
         주어진 일수만큼 더해서 7로 나눈 나머지를 요일 배열에 대치만 시켜주면 됨 */
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        int cnt = 0;

        for (int i = 0; i < x; i++) {
            cnt = cnt + month[i];
        }

        cnt += y;

        System.out.println(day[(cnt % 7) - 1]);

    }
}
