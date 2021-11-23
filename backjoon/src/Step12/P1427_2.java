package Step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1427_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[10];

        String N = br.readLine(); // 예. 123

        for (int i = 0; i < N.length(); i++) { // length = 3
            count[N.charAt(i) - '0']++;
            // count[1] = 1
            // count[2] = 1
            // count[3] = 1
        }

        for (int i = 9; i >= 0; i--) { // 10번 루프를 돈다.
            while (count[i] > 0) { // count[9~4] 까지는 0 이므로 돌지 않는다.
                System.out.print(i); // count[3] = 1 이므로 루프를 타고 i 값인 3 출력
                count[i]--; // count[3] = 0
            }
        }

        /* 다른 예
        * 1541
        * count[1] = 2
        * count[4] = 1
        * count[5] = 1
        *
        * 배열 상태
        * 0 1 2 3 4 5 6 7 8 9
        * 0 2 0 0 1 1 0 0 0 0
        *
        * i = 5 일 때 출력하고 1 감소!
        * i = 4 일 때 출력하고 1 감소!
        * i = 1 일 때 출력하고 1 감소!
        * i > 0 이므로 1을 또 출력하고 1 감소!
        *  */
    }
}
