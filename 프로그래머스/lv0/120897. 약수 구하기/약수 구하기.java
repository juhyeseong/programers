import java.util.*;

class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        
        for(int i = 1; i <= n; i++) {   
            if(n % i == 0) {
                cnt++;                  // 배열의 길이
            }
        }
        
        int[] answer = new int[cnt];
        cnt = 0;
        
        for(int i = 1; i <= n; i++) {    // 1 ~ n을 모두 비교
            if(n % i == 0) {             // 24의 약수이면
                answer[cnt] = i;         // answer의 cnt번째 원소에 대입하고
                cnt++;                   // 다음 index번호로
            }
        }        
        
        return answer;
    }
}