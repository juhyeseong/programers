class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if(a % 2 != 0 && b % 2 != 0) {                                  // 모두 홀수이면 서로의 제곱을 더한 값을 반환
            answer = (a * a) + (b * b);
        }
        if((a % 2 != 0 && b % 2 == 0) || (a % 2 == 0 && b % 2 != 0)) {  // 하나만 홀수라면 2 * (a + b) 의 값을 반환
            answer = 2 * (a + b);
        }
        if(a % 2 == 0 && b % 2 == 0) {                                  // 모두 홀수면 a - b의 절대값을 반환
            if(a - b < 0) {                                           
                answer = -(a - b); 
            }
            else {
                answer = a - b;
            }
        }
        
        return answer;
    }
}