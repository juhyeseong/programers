class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        answer += my_string.substring(0, n);    // my_string문자열에서 index가 0 ~ 11이전까지의 문자를 반환
        
        return answer;
    }
}