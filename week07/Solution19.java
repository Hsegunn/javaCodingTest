package week07;

public class Solution19 {
    public int solution(int order) {
        int count = 0;
        // order가 0이 아니면 반복(order가 0이면 반복을 멈춤)
        while (order != 0) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) 
            count++;
            // 일의 자리수를 10을 나눠서 삭제
            order /= 10;
        }
        return count;
    }
        public static void main(String[] args) {
        Solution19 sol = new Solution19();
        int result = sol.solution(29423);
        System.out.println("박수: "+result +"번");
    }
}
