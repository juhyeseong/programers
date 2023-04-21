class Solution {
    public int[] solution(int[] num_list, int n) {
	        int[] answer = new int[n];
	        boolean limitLength = 2 <= num_list.length && num_list.length <= 30 && 1 <= n && n <= num_list.length;
	        boolean limitOb = false;
	        
	        if(limitLength) {
	            for(int i = 0; i < n; i++) {
	                for(int j = 0; j < answer.length; j++) {
	                    if(answer[j] == 0 && 1 <= num_list[i] && num_list[i] <= 9) {
	                        answer[j] = num_list[i];
                            break;
	                    }
	                }
	            } 
	        }
	        
	        return answer;
	    }
}