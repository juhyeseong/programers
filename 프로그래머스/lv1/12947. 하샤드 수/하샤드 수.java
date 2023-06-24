class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String tmp = x + "";
        int sum = 0;
        
        for(int i = 0; i < tmp.length(); i++) {
            sum += Integer.parseInt(tmp.charAt(i) + "");    // 모든 자릿수의 합
        }
        
        if(x % sum != 0) {                                  // x를 모든 자릿수의 합으로 나눠 0이 되지 못하면
            answer = false;                                 // false를 반환
        }
        
        return answer;
    }
}