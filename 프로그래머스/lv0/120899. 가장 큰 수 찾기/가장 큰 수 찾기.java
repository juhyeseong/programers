import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] array) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int max = 0;
        int index = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        
        answer.add(max);
        answer.add(index);
        
        return answer;
    }
}