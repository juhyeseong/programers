import java.util.*;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(binomial.split(" ")));
        
        if(list.get(1).equals("+")) {
            answer = Integer.parseInt(list.get(0)) + Integer.parseInt(list.get(2));
        }
        else if(list.get(1).equals("-")) {
            answer = Integer.parseInt(list.get(0)) - Integer.parseInt(list.get(2));
        }
        else if(list.get(1).equals("*")) {
            answer = Integer.parseInt(list.get(0)) * Integer.parseInt(list.get(2));
        }
        else {
            answer = Integer.parseInt(list.get(0)) / Integer.parseInt(list.get(2));
        }
        
        return answer;
    }
}