class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char ch = 'A';
        
        for(int i = 0; i < answer.length; i++) {            // answer에 모든 원소를 가져와서
            for(int j = 0; j < my_string.length(); j++) {   // my_string의 모든 원소를
                if(my_string.charAt(j) == ch) {             // 현 ch의 알파벳과 동일하면
                    answer[i]++;                            // 현 answer의 i번째 원소에 1을 더해준다
                }
            }
            if(ch == 'Z') {                                 // ASCII코드상 'Z'(90)일 때 다음 알파벳의 코드 번호가 97이므로
                ch += 7;                                    // 7을 더해주고
            }
            else {                                          // 'Z'가 아닌 나머지는
                ch++;                                       // 1을 더해준다
            }
            
        }
        
        return answer;
    }
}