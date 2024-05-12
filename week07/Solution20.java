package week07;

public class Solution20 {
    public int solution(int n) {
        int answer = 0;
        // 1부터 n까지 자연수 중 합성수의 개수를 구하기 위한 반복문
        for(int i=1; i<= n; i++){
            int count = 0;  // 약수의 개수 count, 각 수마다 count 초기화
            for(int j = 1; j <= i; j++){
                // 나누어 떨어지면 count +1
                count += (i % j ==0) ? 1 : 0;
            }
            // 약수의 개수가 세 개이상이면 합성수이기 때문에 answer+1
            answer += (count >= 3 ) ? 1 : 0;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution20 sol = new Solution20();
        int result = sol.solution(10);
        System.out.println("합성수의 갯수: "+result +"개");
    }
}
