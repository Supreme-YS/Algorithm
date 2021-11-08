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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] deck = new int[N];

        System.out.println(N);
        System.out.println(M);

        st = new StringTokenizer(br.readLine(), " "); // 새로운 토크나이저 생성
        for (int i = 0; i < deck.length; i++) {
            deck[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(deck));
    }
}
