/* 1065번 : 한수 */

package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hansu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(hansu(Integer.parseInt(br.readLine())));
    }

    public static int hansu(int num) {
        int cnt = 0; // 한수 갯수
        if (num < 100) {
            return num; // 100보다 작으면 그대로 리턴
        }

        else { // 100보다 크면
            cnt = 99; // 일단 99개 깔고 시작
            if (num == 1000) { // 예외처리 필수
                num = 999;
            }

            for (int i = 100; i <= num; i++) {
                int hun = i / 100; // 백의 자릿수
                int ten = (i / 10) % 10; // 십의 자릿수
                int one = i % 10; // 일의 자릿수

                if ((hun - ten) == (ten - one)) { // 각 자릿수의 차가 수열을 이루면
                    cnt++; // 한수 카운트 증가 후
                }
            }
        }
        return cnt; // 카운트 값 리턴
    }
}

