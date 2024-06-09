// 진료순서정하기
package week11;

import java.util.Arrays;

public class Solution27 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
            
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                        answer[i]++;
                }
            }
            answer[i]++;
        }  
        return answer;
    }
    public static void main(String[] args) {
    Solution27 solution = new Solution27();

    // 테스트 케이스 1
    int[] emergency1 = {3, 76, 24};
    int[] result = solution.solution(emergency1);
    System.out.println("result: " + Arrays.toString(result));
    }
}
