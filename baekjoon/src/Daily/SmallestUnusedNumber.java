import java.util.*;
import java.io.*;


public class SmallestUnusedNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(findSmallestUnusedNumber(arr));
    }

    public static int findSmallestUnusedNumber(int[] arr) {
        int[] countingArr = new int[10];

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            countingArr[arr[i]]++;
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
