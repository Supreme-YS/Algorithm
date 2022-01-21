import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IqTest {
    public static void main(String[] args) throws IOException {
        System.out.println(findOddOrEvenNumber());
    }
    /**
     * @Method : findOddOrEvenNumber
     * @Description : 배열의 길이와 길이 만큼의 숫자를 공백으로 구분하여 입력받아, 홀수 혹은 짝수의 위치 인덱스를 찾는 함수
     * @return result
     * @throws IOException
     */
    public static int findOddOrEvenNumber() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        System.out.print("숫자 개수를 입력하세요 : ");
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        System.out.printf("공백을 기준으로 %d개의 숫자를 입력하세요 : ", N);
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        int[] validation = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                validation[i] = 1;
            } else {
                validation[i] = 0;
            }
        }

        for (int i = 0; i < validation.length - 1; i++) {
            if (validation[i] == validation[i + 1]) {
                continue;
            } else if (i == validation.length - 2) {
                result = i + 2;
            } else {
                result = i + 1;
            }
        }
        return result;
    }

}
