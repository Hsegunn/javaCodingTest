package week07;

public class Solution18 {
    public int[] solution(int n) {
        int ans = 0; //배열 answer의 크기변수
        int index = 0; //배열 answer의 인덱스변수
        
        // n의 약수 구하기
        for (int i=1; i<=n; i++) {
           if (n % i == 0) {
               ans++;
           } 
        }
        
        //약수의 개수의 배열 선언
        int[] answer = new int[ans];
        
        for (int i=1; i<=n; i++) {
           if (n % i == 0) {
               answer[index++] = i; 
           } 
        }
        
        return answer;
    }
    public static void main(String[] args) {
        Solution18 sol = new Solution18();
        int[] result = sol.solution(24);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
    }
}
}
