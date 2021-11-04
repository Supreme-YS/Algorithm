package Weekly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OverAverage2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int test_case = Integer.parseInt(br.readLine());
        int[] arr;

        for (int i = 0; i < test_case; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken()); // 첫 번째 for 문에서 첫 번째 토큰이 자료의 갯수로 사용됨
            arr = new int[N];

            double sum = 0;

            for (int j = 0; j < N; j++) {
                int value = Integer.parseInt(st.nextToken()); // 두 번째 토큰부터는 value 값이 입력되니 그 값을 합친다.
                arr[j] = value;
                sum += value;
            }

            double mean = (sum / N);
            double count = 0;

            for (int k = 0; k < N; k++) {
                if (arr[k] > mean) {
                    count++;
                } else {
                    continue;
                }
            }
            System.out.printf("%.3f%%\n", (count / N) * 100);
        }
    }
}
