package Step12;

import java.io.*;

/* 중복되는 숫자가 있다 */
/* 중복되는 숫자가 없을 땐 boolean형 배열을 사용하면 되지만
중복되는 숫자는 빈도수를 기반함
 */
public class P10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10001]; // 수의 범위 배열

        // 숫자의 빈도 인덱스를 증가시킨다.
        for(int i=0; i<N; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        } // 예. 숫자 1이면 arr[1]이 0에서 1로 증가, 다음 숫자도 1이면 1에서 2로 됨

        // 배열을 돌자!
        for(int i=1; i < 10001; i++ ){ // 배열은 전체를 다 돌면서 탐색
            while (arr[i] > 0){ // 배열 인덱스의 증가 됐던 빈도수를 하나씩 깎으면서 0이 될때까지 반복
                sb.append(i).append('\n');
                arr[i]--;
            }
        }
        System.out.println(sb);
    }
}
