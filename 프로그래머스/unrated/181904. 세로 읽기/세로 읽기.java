class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String tmp = "";
        
        for(int i = 0; i < my_string.length() / m; i++) {       // 세로 줄 수
            for(int j = 0 + (m * i); j < m + (m * i); j++) {    // 세로 한 줄에 담아 줄 for문
                tmp += my_string.charAt(j);                     // 세로 한 줄의 내용을 담아줄 임시 변수
            }
            answer += tmp.charAt(c - 1);                        // index의 번호가 0부터 시작하기 때문에 c - 1 번째 원소를 가져온다
            tmp = "";                                           // 임시로 담아줄 변수를 초기화 시켜준다
        }
        
        return answer;
    }
}