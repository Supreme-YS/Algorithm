import java.io.*;

public class FindQuarter {
    public static void main(String[] args) throws IOException {
        System.out.println(findQuarter());
    }
    /**
     * @Method : findQuarter
     * @Description : 월(month)을 입력하고 월에 해당하는 분기를 리턴한다.
     * @return quarter
     * @throws IOException
     */
    public static int findQuarter() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("월을 입력하세요 : ");
        int month = Integer.parseInt(br.readLine());

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
