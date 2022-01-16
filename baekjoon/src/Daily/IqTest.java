import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class IqTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println("numbers = " + Arrays.toString(numbers));


        System.out.println(findOddOrEvenNumber(numbers));
    }

    public static int findOddOrEvenNumber(int[] numbers) {
        int result = 0;
        int[] validation = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                // 홀수면 1
                validation[i] = 1;
            } else {
                // 짝수면 0
                validation[i] = 0;
            }
        }

        for (int i = 0; i < validation.length - 1; i++) {
            if (validation[i] == validation[i+1]) {
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
