package week09;

public class Solution25 {
    public int solution(int[] numbers, int k) {
        // 한명을 건너띄고 던지므로 인덱스는 2 증가
        // 첫번째에 공을 던지는 것은 항상 0번 인덱스이므로 (k-1)
        return numbers[2 * (k - 1) % numbers.length];
    }
    public static void main(String[] args) {
        Solution25 sol = new Solution25();

        int[] numbers = {1, 2, 3, 4};
        int k = 2;
        int result = sol.solution(numbers, k);
        System.out.println("Result: " + result);
    }
}
