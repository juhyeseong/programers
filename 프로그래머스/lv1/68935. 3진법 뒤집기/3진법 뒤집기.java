import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int three = 1;
        
        while(n > 0) {
            int tmp = n % 3;
            list.add(tmp);
            n /= 3;
        }
        
        for(int i = list.size() - 1; i >= 0; i--) {
            if(i == list.size() - 1) {
                answer += list.get(i) * three;
            }
            else {
                three *= 3;
                answer += list.get(i) * three;
            }
        }
        
        return answer;
    }
}