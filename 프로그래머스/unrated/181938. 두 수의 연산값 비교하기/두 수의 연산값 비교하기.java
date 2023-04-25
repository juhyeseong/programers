class Solution {
    public int solution(int a, int b) {
	        int answer = 0;
	        String msg = null;
	        int sum = 0;
	        int mul = 0;
	        boolean limit = 1 <= a && a < 10000 && 1 <= b && b < 10000;
	        
	        if(limit) {
	            sum = Integer.parseInt( a + "" + b);    // a와 b를 문자열로 바꿔 서로 붙여준 뒤 int값으로 파싱하여 sum변수에 저장
	            mul = 2 * a * b;                        // 문제에서의 조건으로 두 정수를 붙여서 쓴 값과 비교할 값 준비
	            
	            if(sum < mul) {                         // 만약 a와 b가 붙은 값보다 비교할 mul변수가 더 크면
	            	answer = mul;                       // mul을 반환하고
	            }
	            else {                                  // a와 b가 붙은 값이 더 크거나 두 변수의 값이 같다면
	            	answer = sum;                       // sum을 반환한다
	            }
	        }
	        
	        return answer;
	    }
}