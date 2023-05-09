class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++) {                       // 문자열의 모든 문자를 불러온다
            if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {  // 만약 index번째 문자가 숫자 0 ~ 9 사이의 ASCII코드 값이면
                answer += Character.getNumericValue(my_string.charAt(i));   // answer에 더해준다
            }
        }
        
        return answer;
    }
}