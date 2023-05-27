import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int tmp : arr) {
            list.add(tmp);
        }
        
        for(int i = 0; i < delete_list.length; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(delete_list[i] == list.get(j)) {     // delete_list의 i번째 원소와 list의 j번째 요소가 같으면
                    list.remove(j);                     // list의 j번째 요소를 삭제하고
                    break;                              // j열의 for문을 break
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}