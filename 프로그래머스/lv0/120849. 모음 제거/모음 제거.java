class Solution {
    public String solution(String my_string) {
        String answer = "";
        String filter = "aeiou";
        
        for(int i = 0; i < my_string.length(); i++) {
            String ch = my_string.charAt(i) + "";        // 현 index의 문자를 문자열 변수에 담아서
            if(!filter.contains(ch)) {                   // filter에 있는 모음과 일치하는게 없으면
                answer += my_string.charAt(i);           // answer에 담아준다
            }
        }
        
        return answer;
    }
}