package Step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 중복된 수가 없고, 수의 범위가 증가함 */

public class P2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[2000001];

        for (int i = 0; i < N; i++){
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        } // 입력한 숫자가 있는 인덱스를 true로 바꿔준다. 예. 1 이면 arr[1000001] 이 true

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]) {
                sb.append((i-1000000)).append("\n"); // 순차적으로 배열을 돌면서 true인 인덱스의 값만 추출하는데
                // 애초에 배열을 2백만개를 만들었었음. 인덱스 자체를 탐색하는 거네...아하
            }
        }
        System.out.print(sb);
    }
}
