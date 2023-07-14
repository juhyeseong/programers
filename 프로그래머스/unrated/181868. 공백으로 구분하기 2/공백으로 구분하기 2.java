import java.util.*;

class Solution {
     public ArrayList<String> solution(String my_string) {
        ArrayList<String> answer = new ArrayList<String>();
        int start = 0;
        for(int i = 0; i < my_string.length(); i++) {   // 문자열에 있는 모든 원소문자들을 하나씩 비교한다
            String ch = my_string.charAt(i) + "";
            if(ch.equals(" ")) {                        // 만약 현재 인덱스의 원소문자가 띄어쓰기이면
                String tmp = "";    
                for(int j = start; j < i; j++) {        // 앞에서 시작지점을 지정한 부분부터 현 index까지
                    tmp += my_string.charAt(j);         // tmp문자열에 담고
                }
                tmp = tmp.replaceAll(" ", "");          // 다 담으면 띄어쓰기만 지우고
                if(!tmp.equals("")) {
                    answer.add(tmp);                    // answer에 추가 후
                    start = i + 1;                      // 현 index 지점 + 1을 시작 지점으로 설정한다
                }
            }
            if(i == my_string.length() - 1) {           // 만약 index가 마지막이면
                String tmp = "";
                for(int j = start; j <= i; j++) {       // 앞에서 지정한 시작지점에서 현 index까지
                    tmp += my_string.charAt(j);         // tmp문자열에 담고
                }
                tmp = tmp.replaceAll(" ", "");          // 듸어쓰기만 지운 후
                if(!tmp.equals("")) {
                    answer.add(tmp);                    // answer에 추가
                }
            }
        }

        return answer;
    }
}