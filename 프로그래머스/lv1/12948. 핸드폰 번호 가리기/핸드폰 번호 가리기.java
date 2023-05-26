class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for(int i = 0; i < phone_number.length(); i++) {
            if(i >= phone_number.length() - 4 ) {           // 뒷 4글자는
                answer += phone_number.charAt(i);           // 전화번호에 맞게 answer에 추가
            }
            else {                                          // 나머지는
                answer += "*";                              // *을 answer에 추가
            }
        }
        
        return answer;
    }
}