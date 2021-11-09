/* 백준 2231번 분해합 */
package Weekly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Decomposition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        int N = Integer.parseInt(br.readLine()); // 1 <= N <= 1000000

        int result = 0;

        for(int i=0; i<N; i++) {
            int number = i;
            int sum = 0;

            while (number != 0){
                sum += number % 10;
                number = number / 10;
            }

            if (sum + i == N){
                result = i;
                arrList.add(result);
            }
        }
        System.out.println(arrList.get(0));
    }
}
