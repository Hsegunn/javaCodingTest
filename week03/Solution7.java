//문자열 정렬하기
package week03;

import java.util.Arrays;

class Solution7 {
    public int[] solution(String my_string) {
        // 문자열에서 알파벳 제거
    	my_string = my_string.replaceAll("[a-z]", "");

        // 각 숫자를 문자열 배열에 담기
        String[] arr = my_string.split("");
        int[] answer = new int[arr.length];
        
        // 문자열 배열을 정수형 배열로 변환
        for (int i = 0; i < arr.length; i++) {
        	answer[i] = Integer.parseInt(arr[i]);
		}
        // 배열 정렬
        Arrays.sort(answer);
        
    	return answer;
    }
    public static void main(String[] args){
        Solution7 sol = new Solution7();
        int[] result = sol.solution("hi12392");
        System.out.println(Arrays.toString(result));       // 정렬된 배열 toString으로 문자열로 출력
    }

}