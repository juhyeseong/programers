class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i = 0; i < num_list.length; i++) {  // 배열의 원소를 들고이기 위한 index번호
            if(num_list[i] < 0) {                   // 처음 등장하는 음수의 원소가 있을 때
                answer = i;                         // 그 index번호를 answer에 반환하고
                break;                              // for문을 중지
            }
            else {
                answer = -1;                        // 만약 없으면 answer에 -1을 반환
            }
        }
        
        return answer;
    }
}