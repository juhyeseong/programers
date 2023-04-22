class Solution {
     public static int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length];
	        boolean limitLength = 1 <= num_list.length && num_list.length <= 1000;
	        boolean limitElement = false;
	        int cnt = 0;
	        
	        for(int i = num_list.length - 1; i >= 0; i--) {
             limitElement = 0 <= num_list[i] && num_list[i] <= 1000;
             for(int j = 0; j < answer.length; j++) {
                 if(limitLength && limitElement) {
                	 answer[cnt] = num_list[i];
                     cnt += 1;
                     break;
                 }
             }
         }
	        
	        return answer;
	 }
}