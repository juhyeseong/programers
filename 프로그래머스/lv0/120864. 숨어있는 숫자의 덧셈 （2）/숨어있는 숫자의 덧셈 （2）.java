class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {          // my_string의 원소가 숫자이면
                String tmp = "";
                for(int j = i; j < my_string.length(); j++) {                       // 현 i번째 index부터
                    if('0' <= my_string.charAt(j) && my_string.charAt(j) <= '9') {  // my_string의 원소가 숫자일 때 까지 tmp에 담아준다
                        tmp += my_string.charAt(j);
                    }
                    else {                                                           // 만약 my_string의 원소가 숫자가 아니면
                        answer += Integer.parseInt(tmp);                             // 현재까지 숫자를 담아준 tmp를 파싱해서 answer에 담아준다
                        i = j;                                                       // 그러고 i를 현 index인 j로 바꿔주고
                        break;                                                       // j차원의 for문을 나간다
                    }
                    if(j == my_string.length() - 1) {                                // 만약 j가 마지막 index번호이면
                        answer += Integer.parseInt(tmp);                             // answer에 tmp를 파싱하여 더해주고
                        i = j;                                                       // i에 j를 대입한다
                    }
                }
            }
        }
        
        return answer;
    }
}