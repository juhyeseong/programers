class Solution {
    public int solution(String binomial) {
       int answer = 0;
        String left = "";
        String right = "";
        
        if (binomial.contains("*")) {
        	left = binomial.substring(0, binomial.indexOf("*"));
        	right = binomial.substring(binomial.indexOf("*")+1, binomial.length());
        	
        	int left2 = Integer.parseInt(left.replace(" ", ""));
        	int right2 = Integer.parseInt(right.replace(" ", ""));
        	
        	answer = left2 * right2;
       
        } else if (binomial.contains("+")) {
        	left = binomial.substring(0, binomial.indexOf("+"));
        	right = binomial.substring(binomial.indexOf("+")+1, binomial.length());
        	
        	int left2 = Integer.parseInt(left.replace(" ", ""));
        	int right2 = Integer.parseInt(right.replace(" ", ""));
        	
        	answer = left2 + right2;
        } else if (binomial.contains("-")) {
          	left = binomial.substring(0, binomial.indexOf("-"));
        	right = binomial.substring(binomial.indexOf("-")+1, binomial.length());
        	
        	int left2 = Integer.parseInt(left.replace(" ", ""));
        	int right2 = Integer.parseInt(right.replace(" ", ""));
        	
        	answer = left2 - right2;
        }
        return answer;
    }
}