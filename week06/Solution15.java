// 모음 제거
// replaceALL함수를 이용하여 입력 문자열의 모음삭제
package week06;

public class Solution15 {
        public String solution(String my_string) {
            String answer = my_string;
            // 모음인 a,e,i,o,u를 배열에 저장
            String[] arr = {"a", "e", "i", "o", "u"};

            //배열 arr 의 각 인덱스 데이터를 차례대로 문자열 a에 저장
            for(String a : arr){
                // replaceAll("찾을 문자열", "바꿀 문자열") : 바꿀 문자열 자리에 ""를 넣어주면 문자가 삭제됨
                answer = answer.replaceAll(a, "");
            }
            return answer;
        }
    public static void main(String[] args) {
		Solution15 sol = new Solution15();
        String result = sol.solution("bus");
        System.out.println(result);
    }

}
