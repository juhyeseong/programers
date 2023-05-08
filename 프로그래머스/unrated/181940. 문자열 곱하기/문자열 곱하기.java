class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        
        for(int i = 0; i < k; i++) { // 문자열의 반복 갯수만큼 for문을 돌려준다
           answer += my_string;      // k가 1번씩 돌 때마다 my_string의 문자열을 answer에 넣어주게 된다.             
        }
        
        return answer;
    }
}