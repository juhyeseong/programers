class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            String tmp = array[i] + "";                 // 현 index번째의 array 원소를 담아줄 임시 문자열 변수
            
            for(int j = 0; j < tmp.length(); j++) {
                if(tmp.charAt(j) == '7') {              // 만약 tmp의 원소중 7이 있으면
                    answer++;                           // 그 갯수에 맞춰 answer에 + 1
                }
            }
        }
        
        return answer;
    }
}