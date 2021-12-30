package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1212 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] firstOct = {"0", "1", "10", "11", "100", "101", "110", "111"};
        String[] oct = {"000", "001", "010", "011", "100", "101", "110", "111"};

        // stream().중개연산().최종연산();
        // Arrays~split - 스트림 생성
        // mapToInt~ - 중개 연산
        // toArrays() - 최종 연산
        // 받을 문자열을 ""을 기준으로 스플릿해서 String 배열에 저장하고
        int[] bi = Arrays.stream(br.readLine().split("")) // 스트림 생성
                // String 배열을 Int 배열로 변환해서 int[] bi에 저장
                .mapToInt(Integer::parseInt) // 중개 연산
                .toArray(); // 최종 연산

//        System.out.println("bi = " + bi);

        sb.append(firstOct[bi[0]]);

        for (int i = 1; i < bi.length; i++) {
            sb.append(oct[bi[i]]);
        }
        System.out.print(sb);
    }
}
