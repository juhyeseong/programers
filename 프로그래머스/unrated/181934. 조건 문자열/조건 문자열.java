class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean limit = 1 <= n && n <= 100 && 1 <= m && m <= 100;
        boolean solution = false;
        
        if(limit) {
            if(ineq.equals("<") && eq.equals("=")) {
                solution = n <= m;
                if(solution) {
                    answer = 1;
                }
                else {
                    answer = 0;
                }
            }
            else if(ineq.equals(">") && eq.equals("=")) {
                solution = n >= m;
                if(solution) {
                    answer = 1;
                }
                else {
                    answer = 0;
                }
            }
            else if(ineq.equals("<") && eq.equals("!")) {
                solution = n < m;
                if(solution) {
                    answer = 1;
                }
                else {
                    answer = 0;
                }
            }
            else {
                solution = n > m;
                if(solution) {
                    answer = 1;
                }
                else {
                    answer = 0;
                }
            }
        }
        
        return answer;
    }
}