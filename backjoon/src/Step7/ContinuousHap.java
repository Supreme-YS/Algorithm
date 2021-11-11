/* 11720번: 연속된 숫자의 합 */
package Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ContinuousHap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();	// N 은 쓸모가 없으므로 입력만 받는다.

        int sum = 0;

        for(byte value : br.readLine().getBytes()) {
            sum += (value - '0');
        }
        System.out.print(sum);
    }
}
