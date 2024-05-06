// 중복된 문자제거
// indexOf() 메소드를 사용, indexOf()메소드는 특정 문자열의 위치를 찾고자 할 때 사용
// my_string.charAt(i)의 인덱스 값이 i와 일치한다면, 
// 그 문자는 앞에 있는 문자들과 중복되지 않았음을 의미하므로 answer에 추가
package week07;

public class Solution17 {
    public String solution(String my_string) {
        // 변수 초기화
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            // indexOf() 메소드는 값과 일치하는 첫번째 인덱스를 반환하기 때문에 중복되는 값은 값으로 들어가지 않음
            if(my_string.indexOf(my_string.charAt(i)) == i){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution17 sol = new Solution17();
        String result = sol.solution("people");
        System.out.println(result);
    }
}
