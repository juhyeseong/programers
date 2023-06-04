import java.util.*;

class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> answer = new ArrayList<String>();
        
        for(int i = my_string.length() - 1; i >= 0; i--) {  // 문자열 크기의 index 수들을 거꾸로 세고
            String tmp = "";                                // 조건에 맞는 원소문자를 받아 list에 넣어 줄 임시 문자열
            for(int j = i; j < my_string.length(); j++) {   // i에서 들어오는 값부터 마지막 index번까지의
                tmp += my_string.charAt(j);                 // 원소를 임시 문자열에 넣어서
            }
            answer.add(tmp);                                // answer에 추가
        }
        
        answer.sort(null);                                  // 접미사의 사전순에 의해 문자열 오름차순을 해준다
        
        return answer;
    }
}