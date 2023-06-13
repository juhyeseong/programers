class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        if(included[0]) {                           // 첫 번째는 a값을 바로 넣어야 함으로 따로 연산을 해준다
            answer += a;
        }
        
        for(int i = 1; i < included.length; i++) {
            a += d;                                 // a에 b를 더해 준 다음
            if(included[i]) {                       // included의 i번째 원소가 true이면
                answer += a;                        // answer에 a를 더해준다
            }
        }
        
        return answer;
    }
}