import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindMiddleNumber {
    public static void main(String[] args) throws IOException {
        System.out.println(findMiddleNumber());
    }
    /**
     * @Method : findMiddleNumber
     * @Description : 중간수의 위치 인덱스를 출력하는 메서드
     * @return result
     * @throws IOException
     */
    public static int findMiddleNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("공백을 기준으로 숫자를 입력하세요 : ");

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];

        int mid = 0;
        int result = 0;

        if (a >= b) {
            if (b >= c) {
                mid = b;
            } else if (a <= c) {
                mid = a;
            } else {
                mid = c;
            }
        } else if (a > c) {
            mid = a;
        } else if (b > c) {
            mid = c;
        } else {
            mid = b;
        }

        for (int i = 0; i < arr.length; i++) {
            if ( mid == arr[i] ) {
                result = i;
            }
        }
        return result;
    }
}
