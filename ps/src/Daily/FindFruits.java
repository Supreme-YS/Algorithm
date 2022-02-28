import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FindFruits {
    public static void main(String[] args) throws IOException {
        System.out.println(findFruits());
    }
    /**
     * @Method : findFruits
     * @Description : 숫자를 입력하면 숫자에 해당하는 과일 코드를 출력한다.
     * @return resultNumber
     * @throws IOException
     */
    public static String findFruits() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("숫자를 입력하세요 : ");
        int inputNumber = Integer.parseInt(br.readLine());
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

    /**
     * @Method : subtractUntilTarget
     * @Description : 과일 코드가 나올 때 까지 연산을 반복하는 메서드
     * @param originNumber
     * @return int
     */
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
                    break;
                }
            }
        }
        return originNumber;
    }
    /**
     * @Method : sumOfEachDigit
     * @Description : 입력받은 숫자의 각 자릿수를 연산하는 메서드
     * @param n
     * @return int
     */
    public static int sumOfEachDigit(int n) {
        int resultSumOfEachDigit = 0;
        while (n != 0) {
            resultSumOfEachDigit += n % 10;
            n /= 10;
        }
        return resultSumOfEachDigit;
    }
}
