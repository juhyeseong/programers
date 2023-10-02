import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int num : d) {
            list.add(num);
        }
        list.sort(null);
        
        for(int element : list) {
            total += element;
            if(total <= budget) {
                answer++;
            }
            else {
                break;
            }
        }
        
        return answer;
    }
}