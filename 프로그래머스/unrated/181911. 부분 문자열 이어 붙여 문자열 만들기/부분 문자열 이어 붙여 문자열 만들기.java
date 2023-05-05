class Solution {
     public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for(int i = 0; i < my_strings.length; i++) {            // myString의 index번호와 2차원 배열인 parts의 1차 index번호를 차례대로 넣어준다
            for(int j = parts[i][0]; j <= parts[i][1]; j++) {   // parts의 1차 index번호의 원소에 0번째 index번호에서 1번째 index번호까지를 범위로 잡아
            	answer += my_strings[i].charAt(j);              // 각각 answer에 담아준다
            }
        }
        
        return answer;
    }
}