class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int sum_square = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            multi *= num_list[i];
            sum_square += num_list[i];
        }
        sum_square *= sum_square;
        
        if(multi < sum_square) {
            answer = 1;
        }
        
        return answer;
    }
}