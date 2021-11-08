/* 15596번 정수 N개의 합 */
/* 함수만 구현하면 됨 이렇게 전부 다 구현할 필요 없음 */
package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Functions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int[] arr = new int[input];
        System.out.println(sum(arr));
    }

    public static long sum(int[] a){
        long temp = 0L;
        for (int i=0; i <a.length; i++){
            a[i] = i+1;
            temp += a[i];
        }
        return temp;
    }
}

