package Step2;

import java.util.Scanner;

public class CheckGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        switch (score / 10) {
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
            case 6:
                System.out.println("D");
            default:
                System.out.println("F");
        }
    }
}
