class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++) {
            if(mode == 0) {                         // mode가 0일 때,
                if(code.charAt(i) == '1') {         // code의 i번째 문자가 1이면
                    mode = 1;                       // mode를 1로 바꾸고
                }
                else if(i % 2 == 0) {               // mode가 1이 아니면 짝수번째의
                    answer += code.charAt(i);       // 문자를 answer에 추가
                }
            }
            else {                                  // mode가 1일 때,
                if(code.charAt(i) == '1') {         // code의 i번째 문자가 1이면
                    mode = 0;                       // mode를 0으로 바꾸고
                }
                else if(i % 2 != 0) {               // mode가 1이 아니면 홀수번째의
                    answer += code.charAt(i);       // 문자를 answer에 추가
                }
            }
        }
        
        if(answer.equals("")) {
            answer = "EMPTY";
        }
        
        return answer;
    }
}