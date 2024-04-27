// 직사각형 출력하기
// 이중 for문을 이용하여 *로 삼각형모양 출력
package week05;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        //입력값
		int n = sc.nextInt();
        // *을 출력하고 줄바꿈
		for (int i = 1; i <= n; i++) {
			//*을 반복 출력
            for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
        sc.close();
	}
}
