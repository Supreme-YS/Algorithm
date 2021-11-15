/* 1065번 : 한수 */

package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hansu {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(arithmetic_sequece(Integer.parseInt(br.readLine())));
    }

    public static int arithmetic_sequece(int num) {
        int cnt = 0;

        if(num < 100) {
            return num;
        }

        else { // 100이상의 수
            cnt = 99;
            if (num == 1000) {
                num = 999;
            }

            for(int i = 100; i <= num; i++){
                int back = i / 100;
                int sip = (i / 100) % 10;
                int il = i % 10;

                if((back - sip) == (sip - il)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
