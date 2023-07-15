class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true) {          // absolutes의 현 index값과 같은 signs의 원소가 true이면
                answer += absolutes[i];     // 현 index의 absolutes의 원소를 answer에 더한다
            }
            else {                          // 만약 false이면
                answer -= absolutes[i];     // 현 index의 absolutes의 원소를 answer에 빼라
            }
        }
        
        return answer;
    }
}