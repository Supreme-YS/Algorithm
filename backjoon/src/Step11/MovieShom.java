/* 1436번 : 영화감독 숌 */
package Step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MovieShom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 666;
        int cnt = 1;

        while (cnt != N) {
            num++;
            if (Integer.toString(num).contains("666")) {
                cnt++;
            }
        }
        System.out.println(num);
    }
}
