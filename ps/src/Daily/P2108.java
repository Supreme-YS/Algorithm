/* 2108번 : 통계학 */
package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        /* 최빈값을 위한 카운트 배열 */
        /* 값의 범위가 -3999~ + 3999 까지 */
        int[] count = new int[8001]; // 음수처리 문제가 발생

        for (int i=0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            count[arr[i] + 4000]++; // 입력과 동시에 카운트 배열 증가
             }
        /* ----------------입력---------------- */

        /* 평균 구현 */
        double sum = 0;
        for (int value : arr) {
            sum = sum + value;
        }
        int average = (int) Math.round( sum / N );
        System.out.println(average);

        /* 중앙값 구현 */
        Arrays.sort(arr);
        System.out.println(arr[(N/2)]);

        /* 최빈값 구현 */


        /* 범위 구현 */
//        int range = arr[arr.length-1] - arr[0];
//        System.out.println(range);
//
//
//        ArrayList<Integer> mode = new ArrayList<>();
//
//        for (int i=1; i < 8001; i++) {
//
//        }
//        System.out.println(mode);
//        Collections.sort(mode);
//        if (mode.size() >= 2) {
//            System.out.println(mode.get(1));
//        } else {
//            System.out.println(mode.get(0));
//        }
    }
}
