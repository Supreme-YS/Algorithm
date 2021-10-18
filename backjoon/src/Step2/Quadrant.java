package Step2;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();

        if ((x >= 0) && (y >= 0)){
            System.out.println("Quadrant 1");
        } else if ((x >= 0) && (y < 0)){
            System.out.println("Quadrant 4");
        } else if ((x < 0) && (y >= 0)) {
            System.out.println("Quandrant 2");
        } else {
            System.out.println("Quadrant 3");
        }
    }
}
