class Solution {
    public int solution(int n) {
        int answer = 1;
        boolean limit = 1 <= n && n <= 100;
        
        if(limit) {
            for(int i = 1; i < n; i++) {        // 사람이 1명 이상이 있어야 피자의 갯수를 셀 수 있게 1 ~ 인원수만큼 반복을 지정
                if(i % 7 == 0 && i != 7) {      // 1판에 7조각이므로 answer에 1을 넣어줬기때문에 7명까지는 한조각이 되어야한다
                    answer++;                   // 그러므로 i != 7이 아닐때 answer의 값에 1이 더 해지게 해준다
                }
                else if(i == 8) {               // 하지만 조건을 7로 나눴을 때 +1이 되게 if문을 걸었기 때문에 8명째에서는 +1이 되지 않기 때문에
                    answer++;                   // 첫번째 피자 추가에서는 8일때 추가할 수 있게 else if문을 
                }
            }
        }
        
        return answer;
    }
}
