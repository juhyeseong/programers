class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        boolean limit = 0 <= start && start <= end && end <= 50;
        
        if(limit) {
            for(int i = 0; i < answer.length; i++) {
                answer[i] = start;
                start += 1;
             }
        }
        
        
        return answer;
    }
}