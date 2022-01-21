import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VictoryPoints {
    public static void main(String[] args) throws IOException {
        System.out.println(getVictoryPoints());
    }
    /**
     * @Method : getVictoryPoints
     * @Description : 게임 수와 게임스코어를 입력하면 스코어를 출력한다.
     * @return result
     * @throws IOException
     */
    public static int getVictoryPoints() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("게임 수를 입력하세요 : ");
        int games = Integer.parseInt(br.readLine());

        String[] scores = new String[games];

        for (int i = 0; i < games; i++) {
            System.out.printf("%d번째 게임의 스코어를 \":\"를 기준으로 입력하세요 : ", i + 1);
            scores[i] = br.readLine();
        }

        int a, b, result = 0;

        for (String score : scores) {
            a = Integer.parseInt(score.split(":")[0]);
            b = Integer.parseInt(score.split(":")[1]);

            if (a > b) {
                result = result + 3;
            } else if (a == b) {
                result = result + 1;
            }
        }
        return result;
    }
}
