// 문자열 계산하기

package week08;

public class Solution23 {
    public int solution(String my_string) {
        // 입력 문자열을 공백을 기준으로 분리하여 배열에 저장
        String[] arr = my_string.split(" ");
        
        // 배열의 첫 번째 요소를 정수로 변환 후 answer 변수에 저장
        int answer = Integer.valueOf(arr[0]);
        
        // 배열의 두 번째 요소부터 마지막 요소까지 반복
        for (int i = 1; i < arr.length; i++) {
            // i(연산자)가 "+" 문자열과 일치하면
            if (arr[i].equals("+")) {
                // 다음 요소를 정수로 변환하여 answer에 덧셈
                answer += Integer.valueOf(arr[i + 1]);
            // i(연산자)가 "-" 문자열과 일치하면
            } else if (arr[i].equals("-")) {
                // 다음 요소를 정수로 변환하여 answer에서 뺄셈
                answer -= Integer.valueOf(arr[i + 1]);
            // 현재 요소가 "+" 또는 "-"가 아니라면 컨티뉴
            } else {
                continue;
            }
        }
        
        // 최종 계산된 answer 값을 반환합니다.
        return answer;
    }
    public static void main(String[] args) {
        Solution23 solution = new Solution23();
        String text = "3 + 4";

        int result = solution.solution(text);
        System.out.println(result); // 5
    }
    
}
