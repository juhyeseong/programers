class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        
        for(int i = n - 1; i < num_list.length; i++) {
            for(int j = 0; j < answer.length; j++) {
                if(answer[j] == 0) {
                    answer[j] = num_list[i];
                    break;
                }
            }
        }
        
        return answer;
    }
}