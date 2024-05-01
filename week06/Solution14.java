// 피자 나눠먹기(2)
// n명이 남지 않게 먹을 수 있는 최소 피자 수
// 피자는 6조각 , 피자조각 수는 딱 맞게 떨어져야 함(나머지가 남으면 안됨)
// 조건 반복문을 이용 
package week06;


public class Solution14 {
        public int solution(int n) {
            int answer = 0;
            // i <= 6 * n 으로 피자의 판 수를 제한
            for (int i = 1; i <= 6 * n; i++) {
                // 나머지가 0이 되도록 조건문 사용
                if (6 * i % n == 0) {
                    answer = i;
                    break;
                }
            }
            return answer;
        }
        public static void main(String[] args) {
		Solution14 sol = new Solution14();
        int result = sol.solution(5);
        System.out.println(result);
	}
}
