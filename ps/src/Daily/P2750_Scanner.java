/* 2750번 */
/* Counting Sort 연습 */
/* 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
둘째 줄부터 N개의 줄에는 수 주어진다.
이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
*/

package Daily;

import java.util.Scanner;

public class P2750_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        /*
            range : -1000~+1000
            0 은 index[1000]을 의미함..
        */
        boolean[] arr = new boolean[2001];

        for (int i=0; i<N; i++) {
            arr[in.nextInt() + 1000] = true;
        }

        for (int i=0; i<2001; i++) {
            if(arr[i]) {
                System.out.println(i-1000);
            }
        }
    }
}
