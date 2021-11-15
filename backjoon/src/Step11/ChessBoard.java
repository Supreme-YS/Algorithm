package Step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChessBoard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[][] arr = new String[N][M];

        String[] sp;
        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                sp = br.readLine().split("");
                arr[i][j] = sp[j];
            }

        }


    }
}
