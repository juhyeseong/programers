import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 0; i < intStrs.length; i++) {   // intStrs의 각 원소마다
            String tmp = "";
            
            for(int j = s; j < s + l; j++) {        // s index에서 시작해 길이가 l만큼 잘라
                tmp += intStrs[i].charAt(j);        // tmp에 저장 후
            }
            
            if(Integer.parseInt(tmp) > k) {         // tmp를 파싱한 값이 k보다 크면
                answer.add(Integer.parseInt(tmp));  // answer에 추가
            }
        }
        
        return answer;
    }
}