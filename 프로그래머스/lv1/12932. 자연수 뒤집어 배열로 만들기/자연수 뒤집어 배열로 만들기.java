import java.util.*;

class Solution {
    public ArrayList<Integer> solution(long n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        String tmp = Long.toString(n);                          // 문자열로 변환
        
        for(int i = tmp.length() - 1; i >= 0; i--) {            // n의 숫자들을 담은 tmp의 index를 거꾸로 센다
            answer.add(Integer.parseInt(tmp.charAt(i) + ""));   // 현 index의 tmp 원소 문자를 answer에 추가한다
        }
        
        return answer;
    }
}