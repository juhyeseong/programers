class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 %d에 있다";
        
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {            // 문자열 배열 seoul의 i번째 원소 문자열이 Kim이면
                answer = String.format(answer, i);  // answer의 %d에 i값을 포멧해준다
            }
        }
        
        return answer;
    }
}