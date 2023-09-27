import java.util.*;

class Solution {
    public ArrayList<Long> solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList<Long>();
        long tmp = (long)x;
        int count = 0;
        
        while(count < n) {
            answer.add(tmp);
            tmp += x;
            count++;
        }
        
        return answer;
    }
}