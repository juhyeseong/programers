class Solution {
    public int solution(int n) {
        int answer = 1;
        boolean limit = 1 <= n && n <= 100;
        
        if(limit) {
            for(int i = 1; i < n; i++) {
                if(i % 7 == 0 && i != 7) {
                    answer++;
                }
                else if(i == 8) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}