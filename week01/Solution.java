// 옷가게 할인받기
// if 조건문을 이용하여 옷가게 할인코딩
class Solution {
    public int solution(int price) {
        if(price >= 500000) {
            price *= 0.8; // 50만원일 때, 20%할인
        } 
        else if(price >= 300000) {
            price *= 0.9; // 30만원일 때, 10%할인
        } 
        else if(price >= 100000) {
            price *= 0.95; // 10만원일 때, 5%할인
        }
        return price;
    }      

public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.solution(250000));
}
}