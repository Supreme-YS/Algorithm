/* 4673번 SelfNumber */
/* 분해합과 유사문제..? */
package Step6;

public class SelfNumber {
    public static void main(String[] args) {
        System.out.println(search(1));
    }

    static int search(int a) {
        if (a < 10000) {
            int origin = a;
            // 자릿수 체크
            int man = a / 10000;
            int chun = (a % 10000) / 1000;
            int baek = ((a % 10000) % 1000) / 100;
            int sip =  (((a % 10000) % 1000) % 100) / 10;
            int il = ((((a % 10000) % 1000) % 100) % 10);
            System.out.println(origin + man + chun + baek + sip + il);
            return search(origin + man + chun + baek + sip + il);
        }

        if (a > 9999) {
            return 0;
        }
        return 0;
    }
}