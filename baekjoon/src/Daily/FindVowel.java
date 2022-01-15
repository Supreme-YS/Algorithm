import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindVowel {

    static final String[] vowel = {"a", "e", "i", "o", "u"};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(findVowel(str));

    }

    public static int findVowel(String str) {
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

    public static int compareVowel(String s) {
        int count = 0;
        for (int i = 0; i < vowel.length; i++) {
            if (s.equals(vowel[i])) {
                count = count + 1;
                break;
            }
        }
        return count;
    }

}