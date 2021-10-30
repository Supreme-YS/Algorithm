package Step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Oxquiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 수 입력 받기
        int test_case = Integer.parseInt(br.readLine());

        String[] arr = new String[test_case];

        // 테스트 케이스 숫자만큼의 스트링 배열 생성
        for (int i = 0; i < test_case; i++){
            arr[i] = br.readLine();
        }

        for (int i = 0; i < test_case; i++){

            int cnt = 0;
            int sum = 0; // 누적합

            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            sb.append(sum).append('\n');
        }
        System.out.print(sb);
    }
}

