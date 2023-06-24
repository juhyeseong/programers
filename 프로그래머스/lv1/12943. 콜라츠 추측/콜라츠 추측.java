class Solution {
    public int solution(long num) {     // overflow를 방지하기 위해 num은 long타입으로 한다
        int answer = 0;
        
        if(num == 1) {
            return answer;
        }
        
        while(num != 1) {               // num이 1이되기 전까지 반복을 진행한다
            if(answer == 500) {         // 만약 횟수가 500번이 넘어가면
                return -1;              // -1을 반환
            }
            if(num % 2 == 0) {          // num이 짝수면
                num /= 2;               // num을 2로 나누고
            }       
            else {                      // 홀수이면
                num = (num * 3) + 1;    // num에 3을 곱하고 1을 더한다
            }
            answer++;                   // 횟수를 증가시켜준다
        }
        
        return answer;
    }
}