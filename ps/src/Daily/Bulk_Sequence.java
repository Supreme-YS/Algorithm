package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// im-Lily 가 푸신건데 몸무게만 신경쓰심

public class Bulk_Sequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        /* 값 입력 부분 */
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        /* 키와 몸무게가 가장 높은 애가 1등 */
        /* 둘 중 비교가 불가능 할 땐 근수가 높은 애가 짱 */
        for (int i=0; i<arr.length; i++){
            int rank = 1;
            for (int j=0; j<arr.length; j++){
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    rank++;
                } else {
                    if (arr[i][0] < arr[j][0]) {
                        rank++;
                    }
                }
            } System.out.printf("%d ", rank);
        }
    }

}
