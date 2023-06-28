class Solution {
    public String solution(String myString) {
        String answer = "";
        boolean limit = 1 <= myString.length() && myString.length() <= 100000;
        
        answer += myString.toUpperCase();
        
        return answer;
    }
}