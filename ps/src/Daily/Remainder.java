package Daily;
import java.util.Arrays;
import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner 객체를 생성한다.
        int[] remainder = new int[10]; // 입력받은 값의 나머지를 담을 배열을 생성한다.
        int cnt = 0; // 서로 다른 나머지 숫자의 갯수 측정
        boolean bl; // n번째와 n+1의 숫자 비교를 위한 boolean

        for (int i=0; i<remainder.length; i++) {
            remainder[i] = input.nextInt() % 42;
        } // 배열의 길이만큼 반복문을 돌면서 10개의 값을 입력받음과 동시에 42를 나눈 나머지 값을 배열의 인덱스에 할당해준다.

        for (int j=0; j<remainder.length; j++) {
            bl = false; // 초기값을 false로 세팅해준다.

            for(int k=j+1; k<remainder.length; k++) { // 첫번째 루프에서 0번째와 1번째의 값을 비교해서
                if ( remainder[j] == remainder[k]){ // 그 값이 같다면
                    bl = true; // true로 boolean형을 바꾸고 for문을 빠져나온다.
                    break;
                }
            }
            if( bl == false ) { // 하지만 값이 다르다면
                cnt ++; // cnt를 1 증가시킨다.
            }
        }
        System.out.println(cnt);
        System.out.println(Arrays.toString(remainder));
    }
}
