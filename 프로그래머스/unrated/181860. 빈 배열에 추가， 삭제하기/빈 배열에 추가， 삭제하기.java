import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index = 0;                                  
        
        for(int tmp : arr) {
            if(flag[index]) {                       // flag의 index번째가 true이면
                for(int i = 0; i < tmp * 2; i++) {  // arr[i]를 arr[i] * 2 개를 list에 추가
                    list.add(tmp);
                }
            }
            else {                                  // flag의 index번째가 false면
                for(int i = 0; i < tmp; i++) {      // list의 마지막 원소를 arr[i]개 제거
                    list.remove(list.size() - 1);
                }
            }
            index++;
        }
        
        int[] answer = new int[list.size()];
        index = 0;
        
        for(int result : list) {
            answer[index] = result;
            index++;
        }
        
        return answer;
    }
}