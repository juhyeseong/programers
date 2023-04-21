class Solution {
    public String solution(String my_string, int n) {
	        String answer = "";
	        boolean limit = 1 <= my_string.length() && my_string.length() <= 1000 && 1 <= n && n <= my_string.length();
	        
	        if(limit) {
	        	for(int i =  my_string.length() - n; i < my_string.length(); i++) {
                    answer += my_string.charAt(i);
                }
	        }
	        
	        return answer;
	    }
}