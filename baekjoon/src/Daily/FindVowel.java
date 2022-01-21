import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindVowel {
    public static void main(String[] args) throws IOException {
        System.out.println(findVowel());
    }
    /**
     * @Method : findVowel
     * @Description : 문자열을 입력하면 모음의 갯수를 출력한다.
     * @return result
     * @throws IOException
     */
    public static int findVowel() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문자열을 입력하세요 : ");
        String str = br.readLine();

        int result = 0;

        String[] strArray = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            strArray[i] = str.split("")[i];
        }

        for (int i = 0; i < strArray.length; i++) {
            result += compareVowel(strArray[i]);
        }
        return result;
    }

    /**
     * @Method : compareVowel
     * @Description : 입력받은 문자열을 모음 배열과의 비교를 위한 하위 메서드
     * @param s
     * @return
     */
    public static int compareVowel(String s) {
        int count = 0;
        final String[] vowel = {"a", "e", "i", "o", "u"};

        for (String value : vowel) {
            if (s.equals(value)) {
                count = count + 1;
                break;
            }
        }
        return count;
    }
}