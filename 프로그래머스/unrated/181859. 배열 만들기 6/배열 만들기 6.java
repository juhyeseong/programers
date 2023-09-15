import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int i = 0;
        
        while(i < arr.length) {
            if(answer.size() == 0) {
                answer.add(arr[i]);
                i++;
            }
            else if(answer.get(answer.size() - 1) == arr[i]) {
                answer.remove(answer.size() - 1);
                i++;
            }
            else if(answer.get(answer.size() - 1) != arr[i]) {
                answer.add(arr[i]);
                i++;
            }
        }
        
        if(answer.size() == 0) {
            answer.add(-1);
        }
        
        return answer;
    }
}