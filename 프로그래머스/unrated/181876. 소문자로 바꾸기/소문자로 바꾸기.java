class Solution {
    public String solution(String myString) {
	        String answer = "";
	        boolean limit = 1 <= myString.length() && myString.length() <= 100000;
	        
	        if(limit) {
	        	for(int i = 0; i < myString.length(); i++) {
	        		if(65 <= myString.charAt(i) && myString.charAt(i) <= 90) {
	        			char ch = (char)(myString.charAt(i) + 32);
	        			answer += ch;
	        		}
	        		else {
	        			answer += myString.charAt(i);
	        		}
	        	}
                // answer = myString.toLowerCase();
	        }
	        
	        return answer;
	    }
}