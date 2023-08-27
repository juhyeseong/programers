class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            if('A' <= my_string.charAt(i) && my_string.charAt(i) <= 'Z') {
                answer += (my_string.charAt(i) + "").toLowerCase();
            }
            else {
                answer += (my_string.charAt(i) + "").toUpperCase();
            }
        }
        
        return answer;
    }
}