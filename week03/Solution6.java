// 개미군단
package week03;

public class Solution6 {
        public int solution(int hp) {
            int answer=hp/5;            //필요한 장군개미의 수를 먼저 구함
            hp %= 5;                    //장군개미를 전부 상대하고 남은 hp
            
            answer+=hp/3;               //남은 hp에 필요한 병정개미의 수를 구함
            hp %= 3;                    //병정개미를 전부 상대하고 남은 hp
            
            answer+=hp/1;               //남은 hp에 필요한 일개미의 수를 구함
            
            return answer;
        }
        public static void main(String[] args){
            Solution6 sol = new Solution6();
            int result = sol.solution(100);
            System.out.println(result);
        }
}

