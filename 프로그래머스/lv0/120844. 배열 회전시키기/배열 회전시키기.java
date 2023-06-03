import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = numbers.clone();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        
        if(direction.equals("right")) {                             // 만약 오른쪽이면
            for(int i = 0; i < answer.length; i++) {
                if(i == 0) {                                        // 0 일때는
                    tmp.add(answer[i + 1]);                         // 리스트에 현 index의 다음 번호를 list에 담고
                    answer[i + 1] = answer[i];                      // 현 index의 다음 번호에 현 index의 값을 넣는다
                }
                else if(i != answer.length - 1) {                   // 0도 아니고 마지막 index번이 아닐때는
                    tmp.add(answer[i + 1]);                         // 리스트에 현 index의 다음 번호를 list에 담고
                    answer[i + 1] = tmp.get(i - 1);                 // 현 index의 다음 번호에 전에 list에 담았던 값을 꺼내 담아준다
                }
                else {                                              // 마지막 번호에서는
                    answer[0] = tmp.get(i - 1);                     // 0번째에 마지막 index의 값을 담아준다
                }
            }
        }
        else {                                                      // 만약 왼쪽이면
            for(int i = answer.length - 1; i >= 0; i--) {           // 오른쪽에서 했던 방법을 반대로 사용한다
                if(i == answer.length - 1) {  
                    tmp.add(answer[i - 1]); 
                    answer[i - 1] = answer[i];
                }
                else if(i != 0) {
                    tmp.add(answer[i - 1]);
                    answer[i - 1] = tmp.get(answer.length - 2 - i);
                }
                else {
                    answer[answer.length - 1] = tmp.get(answer.length - 2 - i);
                }
            }
        }
        
        return answer;
    }
}