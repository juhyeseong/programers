import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int min = 1000001;              // result 원소의 크기가 arr의 원소보다 클 수 없기 때문에 arr 원소의 최대기리보다 1 큰 값을 초기 min값으로 설정
            
            for(int i = s; i <= e; i++) {
                if(arr[i] > k && arr[i] < min) {
                    min = arr[i];
                }
            }
            if(min == 1000001) {
                answer.add(-1);
            }
            else {
                answer.add(min);
            }
        }
        
        return answer;
    }
}