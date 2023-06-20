import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        String answer = "";
        
        Arrays.sort(arr);                           // 사전순 정렬
        
        for(int i = 0; i < arr.length; i++) {       
            int count = 0;                          // 문자의 갯수
            
            for(int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])) {         // i차에서의 index 원소가 j차에서의 index 원소랑 같으면
                    count++;                        // 문자의 갯수를 올린다
                }
                if(count >= 2) {                    // 만약 문자의 갯수가 2개 이상이면
                    break;                          // break
                }
            }
            
            if(count == 1) {                        // 문자 갯수가 1이면
                answer += arr[i];                   // answer에 현 index번째 원소 문자를 추가한다
            }
        }
        
        return answer;
    }
}