import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = -1;                                                        // 절대 같을 수 없으면 -1을 반환
        
        if(A.equals(B)) {                                                       // 처음부터 같다면
            return 0;                                                           // 0을 반환
        }
        
        for(int i = 1; i <= A.length(); i++) {                                  // 오른쪽으로 한칸씩 밀기위해
            A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);   // 젤 뒤의 문자를 젤 앞에 붙히고 나머지 문자들을 그 뒤에 붙혀서 A에 대입
            
            if(A.equals(B)) {                                                   // A와 B가 같다면
                answer = i;                                                     // for문이 반복한 횟수를 반환
                break;
            }
        }
        
        return answer;
    }
}