import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<String>();
        
        for(String tmp : strArr) {
            if(!tmp.contains("ad")) {
                answer.add(tmp);
            }
        }
        
        return answer;
    }
}