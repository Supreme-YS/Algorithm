package Weekly;

import java.util.Scanner;

public class SecTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("초 입력 : ");

        int hour, min, sec;
        sec = scanner.nextInt();

        min = sec / 60;
        hour = min / 60;
        sec = sec % 60;
        min = min % 60;

        System.out.printf("입력하신 초는 %d시간 %d분 %d초 입니다.", hour, min, sec);
    }
}
