package Step7;

import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.nextLine().charAt(0);

        int num = (int)ch;

        System.out.println(num);

    }
}
