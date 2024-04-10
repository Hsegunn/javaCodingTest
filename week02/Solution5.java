//특정 문자 제거하기
//replace를 이요한 특정문자 제거
package week02;

class Solution5 {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;
    }
    public static void main(String[] args){
        Solution5 sol = new Solution5();
        String result = sol.solution("abcdef","f");
        System.out.println(result);
    }
}