import java.util.*;

class Solution {
     public ArrayList<String> solution(String my_string) {
        ArrayList<String> answer = new ArrayList<String>();
        int start = 0;
        for(int i = 0; i < my_string.length(); i++) {
            String ch = my_string.charAt(i) + "";
            if(ch.equals(" ")) {
                String tmp = "";
                for(int j = start; j < i; j++) {
                    tmp += my_string.charAt(j);
                }
                answer.add(tmp);
                start = i + 1;
            }
            if(i == my_string.length() - 1) {
                String tmp = "";
                for(int j = start; j <= i; j++) {
                    tmp += my_string.charAt(j);
                }
                answer.add(tmp);
            }
        }

        return answer;
    }
}