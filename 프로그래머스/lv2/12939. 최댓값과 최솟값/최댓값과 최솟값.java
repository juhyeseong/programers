class Solution {
    public String solution(String s) {
        String answer = "";
        int max = 0, min = 0, start = 0;                // 최댓값, 최솟값 그리고 띄어쓰기 연산 이후 띄어쓰기 뒤에 시작 index를 설정해 줄 변수 start 선언
        boolean isFirst = true;                         // 첫 숫자인지 판별할 변수 선언
        
        for(int i = 0; i < s.length(); i++) {
            String tmpStr = "";                         // 띄어쓰기 이전의 숫자를 담아줄 임시 문자열 변수
            int tmp = 0;                                // 숫자를 담은 임시 문자열을 int타입으로 받아줄 변수
            
            if(s.charAt(i) == ' ') {                    // s 문자열의 i번째 원소 문자가 띄어쓰기 일 때
                for(int j = start; j < i; j++) {        // 시작 index부터 현 띄어쓰기 전까지
                    tmpStr += s.charAt(j);              // 원소를 임시 문자열 변수에 저장
                }
                tmp = Integer.parseInt(tmpStr);         // 임시 문자열 변수를 int타입으로 변환
                start = i + 1;                          // 시작 index를 현 띄어쓰기 다음의 index번호로 변경
                if(isFirst) {                           // 만약 첫 번째 숫자이면
                    max = tmp;                          // 최댓값과 최솟값에 tmp를 둘 다 넣어준다
                    min = tmp;
                    isFirst = false;                    // 그 뒤 첫 번째 숫자 판별 변수에 false
                }
                else {
                    if(max < tmp) {                     // tmp가 max보다 크면 tmp가 max값이 되고
                        max = tmp;
                    }
                    if(min > tmp) {                     // tmp가 min보다 작으면 tmp가 min값이 된다
                        min = tmp;
                    }
                }
            }
            if(i == s.length() - 1 && s.charAt(i) != ' ') { // 만약 마지막 index번째가 띄어쓰기가 아닐 경우
                for(int j = start; j <= i; j++) {           // 시작 index에서 마지막 index까지
                    tmpStr += s.charAt(j);                  // 임시 문자열 변수에 값을 넣어주고
                }
                tmp = Integer.parseInt(tmpStr);             // int타입으로 변경 후
                
                if(max < tmp) {                             // 최댓값 최솟값 비교해준다
                    max = tmp;
                }
                if(min > tmp) {
                    min = tmp;
                }
            }
        }
        
        answer += min + " " + max;                          
        
        return answer;
    }
}