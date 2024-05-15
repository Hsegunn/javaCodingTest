package week08;

public class Solution21 {
    public int solution(int n) {
        int answer = 0;
        int fac = 1;
        int index = 1;
         while(fac < n){
             fac *= index;
            
             if(fac < n){
                  index++;
              }else if(fac == n){
                  answer = index;
              }else if(n < fac){
                 answer = (index-1);
             } 
         }
        return answer;
    }
        public static void main(String[] args) {
        Solution21 sol = new Solution21();
        int result = sol.solution(3628800);
        System.out.println(result +"!");
    }
}
