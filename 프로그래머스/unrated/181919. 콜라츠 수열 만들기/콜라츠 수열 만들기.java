import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(n);          // 연산 전의 n을 추가
        
        while(n != 1) {         // n이 1이될 때까지 반복
            if(n % 2 == 0) {    // 만약 n이 짝수면
                n /= 2;         // n / 2한 값을 n에 담아주고
                answer.add(n);  // answer에 추가
            }
            else {              // 홀수이면
                n = 3 * n + 1;  // 3 * n + 1한 값을 n에 담아주고
                answer.add(n);  // answer에 추가
            }
        }
        
        return answer;
    }
}