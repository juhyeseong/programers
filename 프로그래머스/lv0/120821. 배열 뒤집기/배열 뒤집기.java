class Solution {
     public static int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length];
	        boolean limitLength = 1 <= num_list.length && num_list.length <= 1000;
	        boolean limitElement = false;
	        int cnt = 0;
	        
	        for(int i = num_list.length - 1; i >= 0; i--) {    	// 매개변수로 받은 배열의 길이만큼 배열의 반대순서로 반복문을 돌린다
             limitElement = 0 <= num_list[i] && num_list[i] <= 1000; 
             if(limitLength && limitElement) {
                 answer[cnt] = num_list[i];    				// 매개변수로 받은 배열의 젤 뒷번째부터 순차적으로 값을 answer가 받게 된다
			 cnt += 1;					// 이때 cnt는 answer의 배열 원소의 자리가 되는 수이다
             }
         }
	        
	        return answer;
	 }
}
