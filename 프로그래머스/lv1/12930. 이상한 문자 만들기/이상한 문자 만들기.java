import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        ArrayList<String> list = new ArrayList<String>();
        String change = "";
        s = s.toLowerCase();                                // 일단 문자열에 있는 원소를 모두 소문자로 바꾼다
        
        for(int i = 0; i < s.length(); i++) {               // s의 원소 문자들을 문자열 list에 각각 추가한다
            String tmp = s.charAt(i) + "";
            list.add(tmp);
        }
        
        int isLast = 0;

        for(String str : list) {                         
            if(str.equals(" ")) {
                answer += change + " ";
                change = "";
                index = 0;
            }
            else {
                if(index % 2 == 0) {
                    change += str.toUpperCase();
                }
                else {
                    change += str;
                }
                index++;
            }
            if(isLast == list.size() - 1){
                if(!str.equals(" ")) {
                    answer += change;
                }
            }
            isLast++;
        }
        
        return answer;
    }
}