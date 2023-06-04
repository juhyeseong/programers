class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        answer = arr.clone();
        
        if(k % 2 == 0) {                                // k가 짝수이면
            for(int i = 0; i < answer.length; i++) {    // 모든 원소에
                answer[i] += k;                         // k를 더하고
            }
        }
        else {                                          // 홀수이면
            for(int i = 0; i < answer.length; i++) {    // 모든 원소에
                answer[i] *= k;                         // k를 곱해라
            }
        }
        
        return answer;
    }
}