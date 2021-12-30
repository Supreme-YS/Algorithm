package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int origin = n;
        int cnt = 0;

//        System.out.println( ((n % 10) * 10)); // 일의 자리를 새로운 숫자의 십의 자리로 만듦
//        System.out.println( ((n / 10) + (n % 10) % 10)); // 각 자릿수의 합을 일의 자리로 만듦
//        System.out.println( ((n % 10) * 10) + ((n / 10) + (n % 10))); // 신규 숫자 생성

        while (true) {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            cnt ++;
//            System.out.println(n);
            if (origin == n) {
                break;
            }
        }
        System.out.println(cnt);
    }
}