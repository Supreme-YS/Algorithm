import java.util.ArrayList;
import java.util.List;

// 이름이 네글자면 친구
public class FindFriends {
    public static void main(String[] args) {
        String[] friends = {"Ryan", "Kieran", "Mark"};
        System.out.println(findFriends(friends));
    }

    public static List<String> findFriends(String[] friends) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < friends.length; i++) {
            if (friends[i].length() == 4) {
                resultList.add(friends[i]);
            }
        }
        return resultList;
    }
}