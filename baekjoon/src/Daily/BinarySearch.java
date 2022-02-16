package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {

            int mid = (start + end) / 2;

            // 찾았을 때 중간점 인덱스 반환
            if (arr[mid] == target) {
                return mid;
            }

            // 중간점의 값보다 찾고자 하는 값이 작을 때 왼쪽 확인
            else if (arr[mid] > target) {
                end = mid - 1;
            }

            // 중간점의 값보다 찾고자 하는 값이 클 때 오른쪽 확인
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 원소 갯수 입력받기
        int n = Integer.parseInt(br.readLine());

        // 찾고자 하는 값 입력받기
        int target = Integer.parseInt(br.readLine());

        // 전체 원소 입력받기
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int result = binarySearch(arr, target, 0, n - 1);

        if (result == -1) {
            System.out.println("찾지 못했습니다.");
        } else {
            System.out.printf("%d 번째 위치에 있습니다.", result + 1);
        }
    }
}
