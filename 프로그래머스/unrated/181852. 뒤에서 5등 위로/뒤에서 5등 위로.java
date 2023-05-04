import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        ArrayList<Integer> num_arr = new ArrayList<Integer>();
        
        for(int i = 0; i < num_list.length; i++) {
        	num_arr.add(num_list[i]);               // num_list를 ArrayList에 담은 다음
        }
        
        num_arr.sort(null);                         // 오름차순으로 숫자를 배열한 다음
        
        for(int i = 5; i < num_arr.size(); i++) {   // 제일 작은 5개의 수를 제외하기 위해 index번호를 5부터 시작
            answer[i - 5] = num_arr.get(i);         // answer[0]부터 차례대로 원소들을 담아준다
        }
        
        return answer;
    }
}