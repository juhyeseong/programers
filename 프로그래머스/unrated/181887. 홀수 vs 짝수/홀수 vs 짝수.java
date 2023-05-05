class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int even = 0, odd = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {                // 짝수번째 원소일 때
                even += num_list[i];        // 짝수합에 더하기
            }
            else {                          // 홀수번째 원소일 때
                odd += num_list[i];         // 홀수합에 더하기
            }
        }
        
        answer += even > odd ? even : odd;  // 짝수의 합이 크면 짝수의 합을 answer에 더하고 아니면 홀수의 합을 더한다
        
        return answer;
    }
}