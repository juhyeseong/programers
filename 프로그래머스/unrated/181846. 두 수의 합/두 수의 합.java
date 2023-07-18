import java.math.*;

class Solution {
	public String solution(String a, String b) {
        String answer = "";
        BigInteger bigNumberA = new BigInteger(a);  // 큰 값을 처리하기 위해 BigInteger로 처리한다
        BigInteger bigNumberB = new BigInteger(b);
        
        answer = (bigNumberA.add(bigNumberB)) + ""; // BigInteger의 덧셈을 처리하기 위해 add메서드를 사용 후 문자열로 형변환
        
        return answer;
    }
}