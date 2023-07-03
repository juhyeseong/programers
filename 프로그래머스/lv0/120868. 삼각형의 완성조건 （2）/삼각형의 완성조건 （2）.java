class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        boolean sidesEqual = sides[0] == sides[1];                  // sides배열 두 변의 길이가 서로 같은지 판별
        int sideMax = 0;                                            // sides배열에서 큰 값
        int sideMin = 0;                                            // sides배열에서 작은 값
        
        if(sidesEqual == false) {                                   // sides배열의 두 변의 길이가 서로 같지 않다면 큰 값과 작은 값으로 변수 지정
            sideMax = sides[0] > sides[1] ? sides[0] : sides[1];
            sideMin = sides[0] > sides[1] ? sides[1] : sides[0];
        }
        
        if(sidesEqual) {                                            // 만약 배열의 두 변의 길이가 서로 같다면
            for(int i = 1; i < sides[0] * 2; i++) {                 // 1 ~ 두 변을 더한 값보다 작을 때까지
                answer++;                                           // answer를 더하는 반복을 진행
            }
        }
        else {                                                      // 두 변이 같지 않다면
            for(int i = 1; i <= sideMax; i++) {                     // 1. 가장 긴 변이 배열의 큰 값일 경우의 연산
                if(sideMin + i > sideMax) {
                    answer++;
                }
            }
            for(int i = sideMax + 1; i < sideMin + sideMax; i++) {  // 2. 나머지 한 변이 가장 긴 변인 경우의 연산
                answer++;
            }
        }
        
        return answer;
    }
}