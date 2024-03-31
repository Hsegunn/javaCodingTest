// 가위 바위 보
class Solution2 {
    public String solution(String rsp) {
        String answer = "";
   
        char scissors = '2';
        char rock = '0';
        char paper = '5';
        
        for(int i = 0; i < rsp.length(); i++){
            // chatAt()는 문자열에서 특정 위치에 있는 문자를 가져오는데 사용
            if(rsp.charAt(i) == scissors){
                answer += rock;
            }
            else if(rsp.charAt(i) == rock){
                answer += paper;
            }
            else if(rsp.charAt(i) == paper){
                answer += scissors;
            }
        }  
        return answer;
    }
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        String input = "205";
        String result = sol.solution(input);
        System.out.println("Result: " + result);
    }
}