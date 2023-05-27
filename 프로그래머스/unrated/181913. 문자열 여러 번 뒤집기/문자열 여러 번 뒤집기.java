class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] list = new String[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            list[i] = my_string.charAt(i) + "";                                                             // my_string 원소를 list에 각각 추가해준다
        }
        
        for(int i = 0; i < queries.length; i++) {                                                           
            int length = queries[i][1] - queries[i][0];                                                     // 구간의 길이를 구하고
            for(int j = queries[i][1]; j >= queries[i][1] - ((queries[i][1] - queries[i][0]) / 2); j--) {   // 구간의 마지막 index번호에서 그 절 반까지
                String tmp = list[j];                                                                       // 서로 자리를 바꿔준 다음
                list[j] = list[j - length];                                                                 // 역순으로 바꿔주기 위해 현 index에 구간의 길이를 빼준 값을 현index와 자리를 바꿔준다
                list[j - length] = tmp;
                length -= 2;                                                                                // length에 -2를 해준다
            }
        }
        
        for(String str : list) {
            answer += str;
        }
        
        return answer;
    }
}