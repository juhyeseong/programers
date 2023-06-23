import java.math.*;

class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        
        if(balls == share || share == 0) {          // 가지수가 1가지이며 공식에서 0이되면 안되기때문에 이 경우는 따로 빼준다
            return 1;
        }
        
        for(int i = 0; i < balls - share; i++) {    // 분자의 n팩토리얼은 m팩토리얼의 크기만큼 나눠지고 나머지만 곱해진다                
            answer *= balls - i;                    // 그렇기 때문에 balls의 갯수에서 balss - share한 만큼 빼준 값을 곱해주면 n팩토리얼에서 m팩토리얼의 크기만큼 나누지고 나머지만 곱해진 값이 분자에 남게 된다
            answer /= i + 1;                        // 또한 반복이 0에서 balls - share전까지이기 때문에 분모의 값이 1 ~ balls - share의 값을 곱한 값을 내기 위해 i + 1을 answer에 나눠준다
        }
        
        return answer;
    }
}