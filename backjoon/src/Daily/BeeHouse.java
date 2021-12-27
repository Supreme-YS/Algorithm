/* 2292번 : 벌집 */

package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeeHouse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(solution(num));
    }

    private static int solution(int n) {
        if (n==1) return 1;
        int i = 2;
        int k = 1;

        while (i<=n){
            i = i + 6*k++;
        }
        return k;
    }
}
