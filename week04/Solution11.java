package week04;

public class Solution11 {

    public int[] solution(int[] array) {
    //2자리 배열 생성
    int[] answer = new int[2];

    int maxNum = 0;
    int indexNum= 0;

    //array의 i번째 원소가 maxNum보다 클 경우 maxNum에 계속해서 갱신하며 할당
    for (int i = 0; i < array.length; i++) {
        if (array[i] > maxNum) {
            maxNum = array[i];
            indexNum = i;
        }
    }
    answer[0] = maxNum;
    answer[1] = indexNum;
    
    return answer;
}
public static void main(String[] args){
    int[] array = {1,8,3};
    int[] result = new Solution11().solution(array);
    System.out.println("Max number: " + result[0] + ", Index number: " + result[1]);
}

}

