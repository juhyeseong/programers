class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for(int i = code - 1; i < cipher.length(); i += code) {    // 인덱스번호는 0부터 시작하므로
                                                                    // code의 -1번째부터 시작해서
                                                                    // code의 배수만큼 거듭한다
            answer += cipher.charAt(i);                             // code의 배수 번째 문자를 answer에 추가한다
        }
        
        return answer;
    }
}