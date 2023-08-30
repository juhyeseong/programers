import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String myString) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        String[] arr = myString.split("x");                     // x를 구분자로 String배열에 각각 값을 넣어준다
        
        for(int i = 0; i < arr.length; i++) {           
            answer.add(arr[i].length());                        // 배열에 담긴 각각의 문자열 길이를 answer에 추가
        }
        if(myString.charAt(myString.length() - 1) == 'x') {     // myString의 마지막 index의 원소가 x이면
            answer.add(0);                                      // answer의 마지막에 0을 추가
        }
        
        return answer;
    }
}