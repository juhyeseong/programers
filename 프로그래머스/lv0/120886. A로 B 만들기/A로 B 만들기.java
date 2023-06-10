import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int sumBefore = 0;
        int sumAfter = 0;
        
        for(int i = 0; i < before.length(); i++) {
            sumBefore += before.charAt(i);          // before의 모든 알파벳의 아스키코드값의 합
            sumAfter += after.charAt(i);            // after의 모든 알파벳의 아스키코드값의 합
        }
        
        if(sumBefore == sumAfter) {                 // 두 합이 같다면
            answer = 1;                             // answer 에 1
        }
        
        return answer;
    }
}