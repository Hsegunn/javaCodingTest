//배열 원소의 길이

package week04;

public class Solution10 {
    //문자열 배열을 받아 각 문자열의 길이를 계산하여 배열로 반환
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
    public static void main(String[] args){
        String[] strlist = {"We", "are", "the", "world!"};
        //인스턴스를 생성, 인스턴스의 solution 메서드를 호출하여 문자열 배열 각각의 길이를 계산
        int[] result = new Solution10().solution(strlist);
        System.out.println(result);
        for (int i = 0; i < result.length; i++) {
            System.out.println(strlist[i] + " Length:" + result[i]);
        }
    }
}
