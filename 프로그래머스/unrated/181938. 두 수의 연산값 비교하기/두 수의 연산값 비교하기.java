class Solution {
    public int solution(int a, int b) {
	        int answer = 0;
	        String msg = null;
	        int sum = 0;
	        int mul = 0;
	        boolean limit = 1 <= a && a < 10000 && 1 <= b && b < 10000;
	        
	        if(limit) {
	            sum = Integer.parseInt( a + "" + b);
	            mul = 2 * a * b;
	            
	            if(sum < mul) {
	            	answer = mul;
	            }
	            else {
	            	answer = sum;
	            }
	        }
	        
	        return answer;
	    }
}