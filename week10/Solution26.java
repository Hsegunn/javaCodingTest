// n의 배수 고르기

package week10;

public class Solution26 {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
    
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i]%n==0){
                count++;
            }
        }
    
        int[] answer = new int[count];
        int index=0;
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i]%n==0){
                answer[index]=numlist[i];
                index++;
            }
        }
    
        return answer;
    }
    public static void main(String[] args) {
        Solution26 sol = new Solution26();

        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = 2;


        int[] result = sol.solution(n, numlist);
        
        // 결과 출력
        System.out.println("Result:");
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
