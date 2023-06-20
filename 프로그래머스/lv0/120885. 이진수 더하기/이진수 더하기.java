class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);    // parseInt의 2진수로 파싱하는 메서드를 이용하여 sum을 구한다
        
        answer = Integer.toBinaryString(sum);                               // 그 sum을 toBinaryString을 이용하여 문자열로 넣어준다
        
        return answer;
    }
}