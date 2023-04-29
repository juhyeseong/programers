import java.util.*;

class Solution {
    public int[] solution(int n) {
        int length = n % 2 == 0 ? n / 2 : (n / 2) + 1;  // answer의 길이를 정하는 변수
                                                        // 짝수일 때는 n / 2개
                                                        // 홀수일 때는 (n / 2) + 1
        int[] answer = new int[length];
        int cnt = 0;
        
        for(int i = 0; i < answer.length; i++) {        // answer의 index번호번째에 넣기 위한 for문
            for(int j = cnt; j <= n; j++) {             // n의 수를 순차적으로 돌리는 for문
                if(j % 2 != 0) {                        // 홀수만 answer에 넣는 조건문
                    answer[i] = j;
                    cnt = j + 1;                        // answer에 넣고 n의 수의 범위를 그 다음 수부터 새기 위한 변수
                    break;
                }
            }
        }
        
        
        
        
        
        return answer;
    }
}