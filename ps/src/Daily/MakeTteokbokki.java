package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeTteokbokki {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 떡의 갯수
        int n = Integer.parseInt(br.readLine());

        // 요청한 길이
        int m = Integer.parseInt(br.readLine());

        // 각 떡의 개별 높이 정보
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 이진 탐색 정보 설정
        int start = 0;
        int end = (int) 1e9; // 십억!
        int result = 0;
        // 이진 탐색 수행
        while (start <= end) {
            long total = 0L;
            int mid = (start + end) / 2;

            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) {
                    total = arr[i] - mid;
                }
            }
            // 떡의 양이 목표 값보다 작은 경우엔 더 많이 잘라야겠쥐?
            if (total < m) {
                end = mid -1;
            }
            // 떡의 양이 충분하다면? 덜 자르기
            else {
                result = mid;
                start = mid + 1;
            }
        }

        System.out.println(result);
    }
}
