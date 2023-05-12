class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String tmp = "";
        
        for(int i = 0; i < myString.length(); i++) {    // myString문자열의 단어들을 하나하나 비교한다
            if(myString.charAt(i) == 'A') {             // 만약 i번째 단어가 'A'이면
                tmp += 'B';                             // 임시 문자열 변수에 'B'를 추가하고
            }
            else {
                tmp += 'A';                             // 아니면 'A'를 추가
            }
        }
        
        if(tmp.contains(pat)) {                         // tmp안에 pat의 문자열이 포함되어 있으면
            answer = 1;                                 // answer에 1을 반환
        }
        
        return answer;
    }
}