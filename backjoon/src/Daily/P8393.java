package Daily;
import java.util.*;
import java.io.*;

public class P8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i=1; i <= n; i++) {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
