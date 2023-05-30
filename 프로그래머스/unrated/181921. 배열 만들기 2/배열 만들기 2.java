import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String str = "";                                            // 5또는 0으로만 구성되어있는지 비교하기 위해 숫자를 담을 문자열 변수
        
        for(int i = l; i <= r; i += 1) {
            int equals = 0;                                         // 문자열의 현 인덱스번째의 문자가 5또는 0일 때 숫자를 세어 줄 카운트 숫자 변수
            str = i + "";                   
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '5' || str.charAt(j) == '0') {  // 현 인덱스의 문자 원소가 5 또는 0이면
                    equals++;                                       // equals 수를 세어준다
                }
            }
            if(equals == str.length()) {                            // 만약 equals의 수가 문자열의 길이와 같을 때는
                list.add(i);                                        // 그 값을 list에 추가한다
            }
        }
        
        if(list.size() == 0) {                                      // 만약 list의 크기가 0이면
            list.add(-1);                                           // -1을 추가
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}