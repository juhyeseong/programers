import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = 1;
        answer[1] = 1;
        ArrayList<Integer> div = new ArrayList<Integer>();
        int min = n < m ? n : m;
        int max = n > m ? n : m;
        
        while(true) {
            boolean isFinish = false;
            
            for(int i = 2; i <= max; i++) {
                if(max % i == 0 && min % i == 0) {
                    max /= i;
                    min /= i;
                    div.add(i);
                    break;
                }
                if(i == max && (max % i != 0 || min % i != 0)) {
                    isFinish = true;
                }
            }
            
            if(isFinish) {
                break;
            }
        }
        
        for(int element : div) {
            answer[0] *= element;
        }
        
        answer[1] = answer[0] * min * max;
        
        return answer;
    }
}