import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FindFruits {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(findFruits(N));
    }

    public static String findFruits(int inputNumber) {
        final Map<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "kiwi");
        fruits.put(2, "pear");
        fruits.put(3, "kiwi");
        fruits.put(4, "banana");
        fruits.put(5, "melon");
        fruits.put(6, "banana");
        fruits.put(7, "melon");
        fruits.put(8, "pineapple");
        fruits.put(9, "apple");
        fruits.put(99, "apple");

        int resultNumber = subtractUntilTarget(inputNumber);
        return fruits.get(resultNumber);
    }

    public static int subtractUntilTarget(int originNumber) {

        if (originNumber > 100) {
            while (originNumber > 100) {
                originNumber -= sumOfEachDigit(originNumber);
            }

        } else {
            while (originNumber > 0) {
                if (originNumber > 9) {
                    originNumber -= sumOfEachDigit(originNumber);
                } else {
                    originNumber = originNumber;
                    break;
                }
            }
        }
        return originNumber;
    }

    public static int sumOfEachDigit(int n) {
        int resultSumOfEachDigit = 0;
        while (n != 0) {
            resultSumOfEachDigit += n % 10;
            n /= 10;
        }
        return resultSumOfEachDigit;
    }
}
