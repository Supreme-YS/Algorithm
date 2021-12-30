package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 만약 순차적으로 등수가 나오게 하려면?
 * **/

public class Bulk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2]; // N행 2열의 배열을 생성

        String[] sp; // 공백으로 분리되는 배열값들의 갯수에 상관없이 값 할당하기 위해 String 배열을 사용

        for(int i=0; i<N; i++){
            sp = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(sp[0]);
            arr[i][1] = Integer.parseInt(sp[1]);
        }

        for (int i=0; i<arr.length; i++){
            int rank = 1; // 이 부분을 몰랐음..어떻게 중복을 처리할 것인지에 대한 고민을 못했음
            for (int j=0; j<arr.length; j++){
                if (i==j) continue;

                else if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){ // 몸무게는 몸무게끼리, 키는 키끼리 전체 비교
                    rank++;
                }
            } System.out.printf("%d ", rank);
        }
    }
}
