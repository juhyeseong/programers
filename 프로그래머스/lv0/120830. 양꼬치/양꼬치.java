class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        boolean limitN = 0 < n && n < 1000;
        boolean limitK = n/10 <= k && k < 1000;
        
        for(int i = 1; i <= n; i++) {
            if(i % 10 == 0) {
                k -= 1;
            }
        }
        
        answer = (n * 12000) + (k * 2000);
        
        return answer;
    }
}