class Solution {
    public int solution(int n) {
        int answer = 0, cnt = 1;
        
        if(n == 0) {
            return answer;                      // n이 0일 때 answer = 0
        }
        
        while(true) {
            int tmp = 1;                        // n과 비교할 임시변수에 *의 항등원인 1을 저장해준다
            
            for(int i = 1; i <= cnt; i++) {      
                tmp *= i;                       // 팩토리얼 기능
            }
            
            if(tmp == n) {                      // 팩토리얼한 값이 n과 같을 때
                answer = cnt;                   // 그 cnt의 값을 answer에 반환
                break;
            }
            else if(tmp > n) {                  // 만약 값을 넘었다면
                answer = cnt - 1;               // 그 cnt에서 -1을 한 값을 answer에 반환
                break;
            }
            else {
                cnt++;                          // 아니면 cnt에 +1을 한 다음 계속 진행
            }
        }
        
        return answer;
    }
}