package Weekly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AplusB6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int TestCase = Integer.parseInt(br.readLine());

        for (int i=0; i<TestCase; i++) {
            st = new StringTokenizer(br.readLine(),",");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
    }
}
