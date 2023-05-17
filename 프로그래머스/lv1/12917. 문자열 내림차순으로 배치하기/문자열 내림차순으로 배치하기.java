class Solution {
    public String solution(String s) {
        String answer = "";
        char ch = 'z';
        
        while(ch >= 'A') {                          // 모든 알파벳의 ASCII코드값 내림차순으로 가져온다
            for(int i = 0; i < s.length(); i++) {   // 알파벳과 비교할 s의 모든 원소를 가져와
                if(s.charAt(i) == ch) {             // 해당 알파벳과 s의 원소가 같으면
                    answer += s.charAt(i);          // 해당 s의 원소를 answer에 저장
                }
            }
            if(ch == 'a') {                         // ASCII코드값에 따라 a일 때 -7을 해야 다음 알파벳으로 넘어간다
                ch -= 7;
            }
            else {                                  // 나머지는 모두 1씩 감소시켜준다
                ch--;
            }
        }
        
        return answer;
    }
}