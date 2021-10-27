package Step3;

import java.io.*;

public class PrintStars3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write('*');
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

/*
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write('*');
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
 */