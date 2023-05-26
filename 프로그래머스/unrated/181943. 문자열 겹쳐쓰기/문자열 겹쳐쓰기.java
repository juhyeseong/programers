class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            if(i == s) {                                                // index번호가 s와 같을 때 
                for(int j = 0; j < overwrite_string.length(); j++) {    // overwrite_string을 answer에 추가
                    answer += overwrite_string.charAt(j);
                }
                i = s + overwrite_string.length() - 1;                  // answer에 들어갈 다음 index값을 i에 대입
            }
            else {                                                      // 나머지는
                answer += my_string.charAt(i);                          // 정상적으로 my_string의 index값에 맞는 원소를 answer에 추가
            }
        }
        
        return answer;
    }
}