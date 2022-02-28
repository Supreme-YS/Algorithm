import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FindFriends {
    public static void main(String[] args) throws IOException {
        System.out.println(findFriends());
    }
    /**
     * @Method : findFriends
     * @Description : 친구 수와 이름을 입력하면 이름이 네글자인 진짜 친구를 리턴한다.
     * @return resultList
     * @throws IOException
     */
    public static List<String> findFriends() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("유저 수를 입력하세요 : ");
        int N = Integer.parseInt(br.readLine());
        String[] friends = new String[N];

        for (int i = 0; i < friends.length; i++) {
            System.out.printf("%d번째 친구의 이름을 입력하세요 : ", i+1);
            friends[i] = br.readLine();
        }

        List<String> resultList = new ArrayList<>();
        for (String friend : friends) {
            if (friend.length() == 4) {
                resultList.add(friend);
            }
        }
        return resultList;
    }
}