//양꼬치
//산술연산자로 간단한 양꼬치 계산 코딩
package week02;

class Solution4 {
    public int solution(int n, int k) {
        int answer = 0;
        answer = (12000 * n) + ((k-(n/10)) * 2000);
        return answer;
    }
public static void main(String[] args){
    Solution4 sol = new Solution4();
    int result = sol.solution(10, 3);
    System.out.println(result);
}
}