class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        
        if(s.length() % 2 == 0) {           // 문자열 s의 길이가 짝수이면
            index = (s.length() / 2) - 1;   // 문자열 s의 길이의 절반값에 1을 뺀 값을 index값으로 정하고
            answer += s.charAt(index);      // 문자열 s의 지정한 index번째 원소를 answer에 담고
            answer += s.charAt(index + 1);  // 그 다음값까지 answer에 담는다
        }
        else {                              // 만약 s의 길이가 홀수이면
            index = s.length() / 2;         // 문자열 s의 길이의 절반값에 1을 뺀 값을 index값으로 정하고
            answer += s.charAt(index);      // 문자열 s의 지정한 index번째 원소만 answer에 담는다
        }
        
        return answer;
    }
}