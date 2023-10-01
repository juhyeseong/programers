import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<String> list = new ArrayList<String>();
        String tmp = Long.toString(n);
        
        for(int i = 0; i < tmp.length(); i++) {
            list.add(tmp.charAt(i) + "");
        }
        
        list.sort(Comparator.reverseOrder());
        
        tmp = "";
        for(String ch : list) {
            tmp += ch;
        }
        
        answer = Long.parseLong(tmp);
        
        return answer;
    }
}