import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index = 0, startIndex = -1, endIndex = 0;   // arr의 index번호를 셀 index변수와 arr의 원소중 2사이의 index번호를 세어줄 startIndex와 endIndex를 선언해준다
        
        for(int tmp : arr) {
            if(tmp == 2 && startIndex == -1) {  // 만약 startIndex가 -1일 때 tmp가 2이면
                startIndex = index;             // startIndex를 현 index번호로 지정해주고
            }
            if(tmp == 2 && startIndex != -1) {  // 만약 startIndex가 -1이 아닐 때 tmp가 2이면
                endIndex = index;               // endIndex에 현 index번호로 지정해준다
            }
            index++;                            
        }
        
        if(startIndex != -1 && endIndex != 0) {             // 그런 뒤에 startIndex번호가 있으면서 endIndex의 값도 0이 아니면
            for(int i = startIndex; i <= endIndex; i++) {   // 정상적으로 startIndex번에서 endindex번까지의 arr의 원소를 list에 추가해준다
                list.add(arr[i]);
            }
        }
        else {                                              // startIndex번호가 -1 이거나 endIndex가 0이면
            list.add(-1);                                   // list에 -1만 추가한다
        }
        
        
        int[] answer = new int[list.size()];

        index = 0;
        for(int tmp : list) {
            answer[index] = tmp;
            index++;
        }
        
        return answer;
    }
}