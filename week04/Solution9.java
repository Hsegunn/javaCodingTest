//문자열 뒤집기
//String 클래스는 인스턴스를 생성할 때 지정된 문자열을 변경할 수 없지만 
//StringBuffer 클래스를 이용하면 변경이 가능
//StringBuffer의 reverse( ) 메서드를 사용하여 문자열 뒤집기
package week04;

public class Solution9 {
    public String solution(String my_string) {
        
        StringBuffer str = new StringBuffer(my_string);
        
        return str.reverse().toString();
    }
    public static void main(String[] args){
        Solution9 sol = new Solution9();
        String result = sol.solution("jaron");
        System.out.println(result);
    }
}