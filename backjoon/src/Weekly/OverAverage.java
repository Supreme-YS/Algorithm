package Weekly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OverAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr;
        int test_case = Integer.parseInt(br.readLine()); // 테스트 케이스 갯수

        StringTokenizer st;

        for(int i = 0; i < test_case; i++){

            st = new StringTokenizer(br.readLine()," ");

            int N = Integer.parseInt(st.nextToken()); // 학생 수
            arr = new int[N]; // 학생 수 만큼의 배열 생성

            double sum = 0; // 성적 누적합

            /* 성적 입력 부분 */

            for(int j = 0; j < N; j ++){
                int val = Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum += val; // 성적 누적
            }

            double mean = (sum / N);
            double count = 0; // 평균이 넘는 학생 수

            // 평균이 넘는 학생 비율 찾기
            for(int j = 0; j < N; j++){
                if(arr[j] > mean){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
    }
}
