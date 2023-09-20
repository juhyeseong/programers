import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 0; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        
        list.sort(null);
        
        for(int i = 0; i < 5; i++) {
            answer.add(list.get(i));
        }
        
        
        return answer;
    }
}