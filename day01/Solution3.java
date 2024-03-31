// 문자열 반복 출력하기
class Solution3 {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i < my_string.length();i++){
            for(int j=0; j < n; j++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        String input = "hello";
        String result = sol.solution(input, 3);
        System.out.println("Result: " + result);
    }
}