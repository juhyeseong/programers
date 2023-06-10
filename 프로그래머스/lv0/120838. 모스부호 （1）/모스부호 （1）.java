import java.util.*;

class Solution {
    public String solution(String letter) {
        // 모스 부호를 a ~ z까지 순서대로 담은 배열
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        // a ~ z까지의 알파벳을 순서대로 담은 문자열
        String eng = "abcdefghijklmnopqrstuvwxyz";
        // letter의 모스부호를 하나씩 담은 문자열 리스트
        ArrayList<String> letterList = new ArrayList<String>(Arrays.asList(letter.split(" ")));
        String answer = "";
        
        for(int i = 0; i < letterList.size(); i++) {    
            for(int j = 0; j < arr.length; j++) {
                if(letterList.get(i).equals(arr[j])) {  // 만약 letter의 모스부호와 arr의 j번째 모스부호가 같다면
                    answer += eng.charAt(j);            // 알파벳 문자열의 j번째의 원소 알파벳을 answer에 넣어준다
                }
            }
        }
        
        return answer;
    }
}