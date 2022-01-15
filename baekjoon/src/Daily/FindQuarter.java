import java.io.*;
import java.util.*;

public class FindQuarter {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(br.readLine());
        System.out.println(findQuater(month));
    }

    public static int findQuater(int month) {
        if (1 <= month && month <= 3) {
            return 1;
        } else if (4 <= month && month <= 6) {
            return 2;
        } else if (7 <= month && month <= 9) {
            return 3;
        } else
            return 4;
    }
}
