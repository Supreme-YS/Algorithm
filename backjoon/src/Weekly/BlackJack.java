package Weekly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BlackJack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb  = new StringBuilder();

        int N = Integer.parseInt(st.nextToken()); // 카드 갯수
        int M = Integer.parseInt(st.nextToken()); // 최대값, 넘으면 안됨

        int[] deck = new int[N];

//      System.out.println(N);
//      System.out.println(M);

        st = new StringTokenizer(br.readLine(), " "); // 새로운 토크나이저 생성

        for (int i = 0; i < deck.length; i++) { deck[i] = Integer.parseInt(st.nextToken()); }
//      System.out.println(Arrays.toString(deck)); // 배열 값 확인

        int result = 0;
        int final_result = 0;

        // 처음에 i=0, j=1, k=2
        // 문제발생! 첫 루프는 괜찮지만 두번째 루프에서 i=0 j=2 k=2라는 루프로 값이 세개 출력이 아닌 두 개의 값으로 연산을 해버리는 경우가 발생
        // 따라서, 유동적인 코드 순환을 위해 변수값을 기준으로 +1을 해줌
        for (int i=0; i < deck.length-2; i++){

            for (int j=i+1; j < deck.length-1; j++){

                for (int k=j+1; k < deck.length; k++) {
                    result = deck[i] + deck[j] + deck[k];

                    if (M == result) {
                        final_result = result;
                        break;

                    } else if (final_result < result && result < M) {
                        final_result = result;
                    }
                }
            }
        }
        System.out.println(final_result);
    }
}