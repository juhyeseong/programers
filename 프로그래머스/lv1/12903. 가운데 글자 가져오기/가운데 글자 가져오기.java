class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        
        if(s.length() % 2 == 0) {
            index = (s.length() / 2) - 1;
            answer += s.charAt(index);
            answer += s.charAt(index + 1);
        }
        else {
            index = s.length() / 2;
            answer += s.charAt(index);
        }
        
        return answer;
    }
}