// A를 B로 만들기
// before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return

package week08;

import java.util.Arrays;

public class Solution22 {
    public int solution(String before, String after) {
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();
            
        Arrays.sort(arr1);
        Arrays.sort(arr2);
            
        String str1 = new String(arr1);
        String str2 = new String(arr2);
            
        return str1.equals(str2) ? 1 : 0;
    }
    public static void main(String[] args) {
        String before = "hello";
        String after = "olelh";

        Solution22 sol = new Solution22();
        int result = sol.solution(before, after);
        
        if (result == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}