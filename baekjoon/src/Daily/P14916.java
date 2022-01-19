package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14916 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(countCoin(n));
    }

    public static int countCoin(int n) {
        int cnt = 0;

        while (n % 5 != 0) {
            n -= 2;
            cnt++;

            if (n < 0) {
                cnt = -1;
                break;
            }
        }

        if (cnt > -1) {
            cnt += n / 5;
        }
        return cnt;
    }
}
