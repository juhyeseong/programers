import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int num : arr) {         
            if(num % divisor == 0){ // 배열의 원소가 divisor로 나누어 떨어지면
                answer.add(num);    // 리스트에 현 원소를 추가
            }
        }
        
        if(answer.size() == 0) {    // 만약 리스트의 크기가 0이면
            answer.add(-1);         // -1을 추가
        }
        
        answer.sort(null);          // 오름차순
        
        return answer;
    }
}