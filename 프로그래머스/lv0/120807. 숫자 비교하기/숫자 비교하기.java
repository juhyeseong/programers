class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        boolean limit = 0 <= num1 && num1 <= 10000 && 0 <= num2 && num2 <= 10000;
        
        if(limit) {
            if(num1 == num2) {  // 두수가 같으면
                answer = 1;
            }
            else {              // 두수가 같지 않으면
                answer = -1;
            }
        }
        
        return answer;
    }
}
