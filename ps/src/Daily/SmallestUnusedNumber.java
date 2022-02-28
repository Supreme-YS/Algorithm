import java.io.*;

class SmallestUnusedNumber {
    public static void main(String[] args) throws IOException {
        System.out.println(findSmallestUnusedNumber());
    }
    /**
     * @Method : findSmallestUnusedNumber
     * @Desription : 배열을 입력받고, 사용하지 않는 가장 작은 숫자를 리턴한다.
     * @return smallestUnusedNumber
     * @throws IOException
     */
    public static int findSmallestUnusedNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("배열의 길이를 입력하세요 : ");
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번째 배열의 값을 입력하세요 : ", i + 1);
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] countingArr = new int[10];

        int result = 0;

        for (int k : arr) {
            countingArr[k]++;
        }

        for (int j = 0; j < countingArr.length; j++) {
            if (countingArr[j] == 0) {
                result = j;
                break;
            }
        }
        return result;
    }
}
