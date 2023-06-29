class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i % 10 == 0) {
                k -= 1;
            }
        }
        
        answer = (n * 12000) + (k * 2000);
        
        return answer;
    }
}