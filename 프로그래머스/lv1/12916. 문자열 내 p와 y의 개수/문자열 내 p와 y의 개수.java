class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int pCount = 0, yCount = 0;
        
        for(int i = 0; i < s.length(); i++) {               // s의 현 index의 원소 문자가
            if(s.charAt(i) == 'Y' || s.charAt(i) == 'y') {  // Y or y 이면
                yCount++;                                   // yCount에 +1을
            }
            if(s.charAt(i) == 'P' || s.charAt(i) == 'p') {  // P or p 이면
                pCount++;                                   // pCount에 +1을 한다
            }
        }
        
        if(yCount == pCount) {                              // 만약 yCount와 pCount가 같다면
            answer = true;                                  // true를 반환
        }

        return answer;
    }
}