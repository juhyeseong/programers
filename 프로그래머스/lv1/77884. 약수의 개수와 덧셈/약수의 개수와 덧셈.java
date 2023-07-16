class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {    // left ~ right까지의 숫자의
            int cnt = 0;
            for(int j = 1; j <= i; j++) {       // 약수의 갯수를 구해서
                if(i % j == 0) {
                    cnt++;
                }
            }
            if(cnt % 2 == 0) {                  // 그 약수의 갯수가 짝수면
                answer += i;                    // 현재 i의 숫자를 answer에 더하고
            }
            else {                              // 숫자가 홀수 이면 
                answer -= i;                    // 현재 i의 숫자를 answer에 빼라
            }
        }
        
        return answer;
    }
}