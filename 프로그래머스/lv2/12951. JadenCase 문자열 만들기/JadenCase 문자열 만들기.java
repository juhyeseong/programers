class Solution {
    public String solution(String s) {
        String answer = "";
        boolean isFirst = true;
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String st = ch + "";
            
            if(isFirst && 'A' <= ch && ch <= 'z') {
                answer += st.toUpperCase();
                isFirst = false;
            }
            else if(st.equals(" ")) {
                answer += " ";
                isFirst = true;
            }
            else {
                answer += st.toLowerCase();
                isFirst = false;
            }
        }
        
        return answer;
    }
}