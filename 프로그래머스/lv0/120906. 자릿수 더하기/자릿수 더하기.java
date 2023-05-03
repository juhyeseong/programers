class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n != 0) {
            answer += n % 10;   // 나머지 연산을 통해 마지막 자리의 값을 answer에 더한다
            n /= 10;            // 몫연산을 통해 마지막 자리의 값을 제거해준다
        }
        
        return answer;
    }
}