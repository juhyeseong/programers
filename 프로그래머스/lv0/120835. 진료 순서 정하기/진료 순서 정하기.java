import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int cnt = 1;                                    // 진료 순서를 정하기 위한 변수
        
        for(int tmp : emergency) {                      // emergency의 모든 원소를
            list.add(tmp);                              // list에 담고
        }
        
         list.sort(Collections.reverseOrder());         // 내림차순으로 정렬한다
        
        for(int tmp : list) {                           // list의 모든 원소들과
            for(int i = 0; i < emergency.length; i++) { // emergency의 모든 원소를 비교하여
                if(tmp == emergency[i]) {               // 만약 emergency의 i번째 원소와 같을 경우
                    answer[i] = cnt;                    // answer의 i번째에 진료 순번을 넣어준다
                    cnt++;                              // 다음 순번을 위해 cnt에 +1을 해준다
                }
            }
        }
        
        return answer;
    }
}