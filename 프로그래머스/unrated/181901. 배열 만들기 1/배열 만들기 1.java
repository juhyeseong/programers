import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++) {   // 1 ~ n 까지
            if(i % k == 0) {            // k의 배수만
                answer.add(i);          // 오름차순으로 list에 추가
            }
        }
        
        return answer;
    }
}