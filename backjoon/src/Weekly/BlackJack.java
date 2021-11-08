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

        for (int i=0; i < deck.length-2; i++){

            for (int j=1; j < deck.length-1; j++){

                for (int k=2; k < deck.length; k++){
                    result = deck[i] + deck[j] + deck[k];
                    sb.append(result).append(" ");
                }
            }
        }
        System.out.println(sb);
    }
}
