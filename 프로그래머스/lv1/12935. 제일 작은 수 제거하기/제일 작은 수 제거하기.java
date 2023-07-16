import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int min = arr[0];                                       // 최소값 초기화
        int index = -1;                                         // index값 초기화
            
        for(int i = 0; i < arr.length; i++) {                   // arr의 원소들 끼리의 비교
            if(min > arr[i]) {                                  // min으로 지정된 값보다 arr[i]의 값이 작으면
                min = arr[i];                                   // min에 arr[i]를 넣고
                index = i;                                      // index에 현재 index값을 넣어준다
            }
        }
        
        if(index == 0) {                                        // 만약 index가 -1이면 
            answer.add(-1);                                     // answer에 -1을 추가
        }
        else {                                                  // 아니면
            for(int i = 0; i < arr.length; i++) {               // min의 index값을 뺀 나머지를 answer에 추가
                if(index != i) {
                    answer.add(arr[i]);
                }
            }
        }
        
        return answer;
    }
}