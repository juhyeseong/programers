import java.util.*;

class Solution {
    public int[] solution(int[][] scores) {
        int[] answer = new int[scores.length];
        double[] avgArr = new double[scores.length];
        Double[] desc = new Double[scores.length];
        int index = 0;
        int rank = 1;
        int sameCount = 0;
        
        for(int[] score : scores) {
            double avg = (score[0] + score[1]) / 2.0;
            
            desc[index] = avg;
            avgArr[index] = avg;
            index++;
        }
        
        Arrays.sort(desc, Collections.reverseOrder());
        
        for(int i = 0; i < desc.length; i++) {
            for(int j = 0; j < avgArr.length; j++) {
                if(desc[i] == avgArr[j]) {
                    if(i != desc.length - 1 && desc[i] - desc[i + 1] == 0) {
                        answer[j] = rank;
                        sameCount++;
                    }
                    else {
                        answer[j] = rank;
                        rank += 1 + sameCount;
                        sameCount = 0;
                    }
                    avgArr[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}