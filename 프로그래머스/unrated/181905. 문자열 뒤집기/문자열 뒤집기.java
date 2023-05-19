class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {       
            if(s == i) {                                // 만약 i가 s일 때
                for(int j = e; j >= s; j--) {           // e부터 s까지 역순으로 인덱스값을 센다
                    answer += my_string.charAt(j);      // 그렇게 되면 s ~ e까지의 범위에는 역순으로 answer에 들어가게 된다
                }
                i += (e - s);                           // 구간 문자열 뒤집기가 완료되면 그 구간 다음 인덱스값부터 시작하게 e - s의 값을 i에 더해준다
            }
            else {
                answer += my_string.charAt(i);          // 나머지는 정상적으로 answer에 더해준다
            }
        }
        
        return answer;
    }
}