class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        
        answer = num % n == 0 ? 1 : 0;  // num가 n의 배수이면 1을 아니면 0을 반환
        
        return answer;
    }
}