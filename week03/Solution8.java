//순서쌍의 갯수
package week03;

class Solution8 {
    public int solution(int n) {
    	int count = 0;
        //몫이 0이 될 때까지 반복문
    	for (int i = 1; i <= n; i++) {
    		if(n%i==0) {        
    			count++;
    		}
		}
    	return count; 
    }
    public static void main(String[] args){
        Solution8 sol = new Solution8();
        int result = sol.solution(20);
        System.out.println(result);
    }

}