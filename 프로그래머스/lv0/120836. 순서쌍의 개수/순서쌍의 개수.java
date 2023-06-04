class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {                    // n을 i이로 나눴을 때 0으로 떨어지면
                for(int j = 1; j <= n; j++) {   // j를 추가해 1 ~ n까지 i와 곱해서
                    if(i * j == n) {            // n이 나오면
                        answer++;               // answer에 +1을 하고
                        break;                  // 2번째 for문 break
                    }
                }
            }
        }
        
        return answer;
    }
}