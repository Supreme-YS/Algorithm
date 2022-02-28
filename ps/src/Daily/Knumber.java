package Daily;

import java.util.*;

// K번째 수, 프로그래머스
public class Knumber {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution.solution(array, commands)));
    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        // result는 두 개가 나와야 하니까 commands.length 까지 선언
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            // i, j, k 값 설정
            int start;
            int end;
            int target;

            // commands 의 각 command에 해당하는 값 할당
            start = commands[i][0]; // 2
            end = commands[i][1];   // 5
            target = commands[i][2];// 3

            // 원본 배열을 i,j,k 값에 맞게 슬라이싱해서 임시 배열 생성
            // start = 2면 배열의 두 번째 array[1]이 되어야 함. 따라서, start - 1
            // end = 5면 배열이 다섯 번째 array[4]가 되어야 함. 따라서, end - 1인데, copyOfRange에서 to 인자값은 포함하지 않음
            // 따라서 to 파라미터 자리에 end는 그대로 end를 씀
            int[] tempArray = Arrays.copyOfRange(array, start - 1, end);

            // 배열 오름차순 정렬
            Arrays.sort(tempArray);

            // 정답 배열의 첫 인덱스에 연산한 값을 할당
            answer[i] = tempArray[target - 1];
        }
        return answer;
    }
}