class Solution {
    public int solution(int n) {
        int answer = 1;                     // 2를 제외한 짝수는 소수가 아니기 때문에 3부터 시작해서 짝수인 것은 제외(3부터 시작하지만 2는 소수이기 때문에 answer의 갯수는 1부터 시작)
        
        for(int i = 3; i <= n; i++) {
            boolean decimal = true;             // 소수인지 판별하는 boolean변수
            if(i % 2 != 0) {
                for(int j = 2; j <= Math.sqrt(i); j++) {    // 2 ~ 자기자신의 제곱근까지
                    if(i % j == 0) {                        // 자신과 나눠서 0으로 떨어지는게 있다면
                        decimal = false;                    // 소수가 아니다
                        break;
                    }
                }

                if(decimal) {                   // 만약 소수이면
                    answer++;                   // answer에 +1
                }
            }
            
        }
        
        return answer;
    }
}