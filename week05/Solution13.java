// 문자열 정렬하기

package week05;

import java.util.Arrays;

public class Solution13 {
    public String solution(String my_string) {
        // my_string을 소문자로 변경
        my_string = my_string.toLowerCase(); 
        // 변경한 문자열을 char 배열에 각각 넣음
        char[] chArr = my_string.toCharArray();
        // 사전 순으로 정렬
        Arrays.sort(chArr);
        // 정렬한 char 배열을 String 생성자로 넣어서 문자열로 변환
        String answer = new String(chArr);
        return answer;
    }
    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        String result = sol.solution("BAcd");
        System.out.println(result);
    }
}
