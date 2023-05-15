class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;

        for(int i = 0; i < date1.length; i++) {     // date1과 date2의 모든 원소를 비교한다
            if(0 <= i && i < 2) {                   // 만약 마지막 원소가 아닐 때
                if(date1[i] < date2[i]) {           // date2가 date1보다 클 때
                    return answer = 1;              // answer = 1을 반환하고
                }
                else if(date1[i] == date2[i]) {      // 만약 둘 다 같을 때
                    answer = 1;                     // answer에 1을 넣고 다음 index를 비교
                }
                else {                              // date1이 date2보다 클 때
                    return answer = 0;              // answer = 0을 반환하고
                }
            }
            else {                                  // 마지막 원소일 때
                 if(date1[i] < date2[i]) {          // date2가 date1보다 클 때는
                    answer = 1;                     // answer = 1을 반환
                 }
                else {                              // date1이 더 크거나 같을 때는
                    answer = 0;                     // answer = 0을 반환
                }
            }
        }

        return answer;
    }
}