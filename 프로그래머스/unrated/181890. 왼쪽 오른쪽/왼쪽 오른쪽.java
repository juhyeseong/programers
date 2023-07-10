import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] str_list) {
        ArrayList<String> answer = new ArrayList<String>();
        
        for(int i = 0; i < str_list.length; i++) {
            String str = str_list[i];
            if(str.equals("l")) {                                   // l과 r 중 먼저 나온 문자열이 l이면
                for(int j = 0; j < i; j++) {                        // 문자열을 기준으로 왼쪽의 문자열들을 리스트에 담고
                    String ch = str_list[j];
                    answer.add(ch);
                }
                break;
            }
            if(str.equals("r")) {                                  // l과 r 중 먼저 나온 문자열이 r이면
                for(int j = i + 1; j < str_list.length; j++) {     // 문자열을 기준으로 오른쪽의 문자열들을 리스트에 담는다
                    String ch = str_list[j];
                    answer.add(ch);
                }
                break;
            }
        }
       
        return answer;
    }
}