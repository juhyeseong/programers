import java.util.*;

class Solution {
    public ArrayList<String> solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<String>();
        int index = 1;
        String tmp = "";
        
        for(int i = 0; i < my_str.length(); i++) {
            tmp += my_str.charAt(i);                // my_str의 글자를 tmp에 하나씩 넣어준다
            
            if(index == n) {                        // 만약 index의 갯수가 n과 같을 때
                answer.add(tmp);                    // answer에 현재까지 쌓인 tmp를 추가하고
                tmp = "";                           // tmp를 초기화한 후
                index = 0;                          // index도 초기화 해준다
            }
            else {                                  // 만약 마지막번호인데 n의 갯수로 딱 맞아 떨어지지 않는다면
                if(i == my_str.length() - 1) {
                    answer.add(tmp);                // 현재까지 쌓은 tmp를 answer에 추가한다
                }
            }
            
            index++;
        }
        
        return answer;
    }
}