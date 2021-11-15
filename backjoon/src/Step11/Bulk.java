/* 7568번 : 덩치 */
package Step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bulk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        String[] sp;

        for (int i = 0; i < N; i++) {
            sp = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(sp[0]);
            arr[i][1] = Integer.parseInt(sp[1]);
        }


        for (int i = 0; i < arr.length; i++){
            int rank = 1;
            for (int j = 0; j < arr.length; j++){
                if(i==j) {
                    continue;
                }

                else if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            System.out.printf("%d ", rank);
        }
    }
}
