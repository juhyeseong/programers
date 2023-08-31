import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i = 0; i < my_string.length(); i++) {
            list.add(my_string.charAt(i) + "");
        }
        
        String tmp = list.get(num1);
        list.set(num1, list.get(num2));
        list.set(num2, tmp);
        
        for(String ch : list) {
            answer += ch;
        }
        
        return answer;
    }
}