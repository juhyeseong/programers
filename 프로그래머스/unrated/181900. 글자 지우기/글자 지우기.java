class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            int isTrue = 0;                             // 현 index번호가 indices에 포함되는지 판별하는 변수
            for(int tmp : indices) {                    
                if(i == tmp) {                          // 만약 현 index번호가 indices에 포함되면
                    isTrue++;                           // isTrue에 +1을 한다
                }
            }
            if(isTrue == 0) {                           // isTrue가 0이면
                answer += my_string.charAt(i);          // answer에 현 index의 문자를 추가한다
            }
        }
        
        return answer;
    }
}