package greedy;

import java.io.*;
import java.util.*;

public class MultiOrPlus {

    static String S;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = br.readLine();

        // 첫 번째 문자를 숫자로 변경한 값을 대입
        answer = S.charAt(0) - '0';
        for (int i = 1; i < S.length(); i++) {

            // 두 수 중에서 하나라도 '0' 혹은 '1'인 경우, 더하기 수행
            int compare = S.charAt(i) - '0';
            if (compare <= 1 || answer <= 1) {
                answer = answer + compare;
            } else {
                answer = answer * compare;
            }
        }
        System.out.println(answer);
    }
}
