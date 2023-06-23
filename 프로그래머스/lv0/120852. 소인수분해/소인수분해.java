import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        int index = 2;
        
        
        while(n != 1) {                 // n이 1일 때 까지
            boolean isFind = false;     // answer안에 index의 숫자가 있는지 판별하는 boolean 값
            
            if(n % index == 0) {        // n이 index로 나눠서 떨어지면
                n /= index;             // n에 index를 나눠서 n에 다시 저장하고
                for(int tmp : answer) { // answer안에 index가 있는지 확인하고
                    if(tmp == index) {  // index가 answer안에 있으면
                        isFind = true;  // isFind를 true로 바꾸고
                    }
                }
                if(isFind == false) {   // isFind가 false이면
                    answer.add(index);  // answer에 index를 추가
                }
            }
            else {                      // n을 index로 나누어서 떨어지지않으면
                index++;                // index++
            }
        }
        
        return answer;
    }
}