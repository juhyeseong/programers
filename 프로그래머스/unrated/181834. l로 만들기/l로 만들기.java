class Solution {
    public String solution(String myString) {
        String answer = "";
        String filter = "abcdefghijk";
        for(int i=0; i<myString.length();i++) {
            String ch = myString.charAt(i) + "";
            if(filter.contains(ch)) {
                answer += ch.replaceAll("a|b|c|d|e|f|g|h|i|j|k", "l");
            } else {
                answer += ch;
            }
        }
        return answer;
    }
}