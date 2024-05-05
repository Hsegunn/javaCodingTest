// 숫자 찾기
// num 숫자에서 k가 몇 번째에 속하는지 출력

package week06;

public class Solution16 {
    public int solution(int num, int k) {
        // 정수를 문자열로 변환
        String num_str = Integer.toString(num);
        // 문자열을 한 글자씩 스플릿하여 배열에 저장
        String[] array = num_str.split("");
        
        for (int i = 0; i < array.length; i++) {
            // 현재 숫자와 k가 같다면 i+1 리턴
            if (array[i].equals(Integer.toString(k))) {
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution16 sol = new Solution16();
        int result = sol.solution(29183, 1);
        System.out.println(result);
    }

}
