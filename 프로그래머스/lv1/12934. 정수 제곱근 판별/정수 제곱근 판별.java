class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = 0;
        
        sqrt = Math.sqrt(n);                            // n의 제곱근을 구하는 메서드를 사용했을 때
        
        if(sqrt % 1 == 0) {                             // 소숫점 이하 숫자가 없는 정수이면
            answer = (long)((sqrt + 1) * (sqrt + 1));   // 제곱근 + 1의 제곱을 answer에 담고
        }
        if(answer == 0) {                               // answer에 아무것도 담기지 않았다면
            answer = -1;                                // -1을 담아라
        }
        
        return answer;
    }
}