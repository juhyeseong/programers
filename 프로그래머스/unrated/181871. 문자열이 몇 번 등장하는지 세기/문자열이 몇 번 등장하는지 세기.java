class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int i = 0; i < myString.length(); i++) {          
            String tmp = "";                                    // pat과 비교할 문자열 임시변수 선언
            if((i + pat.length() - 1) == myString.length()) {   // 만약 현 index에서 pat의 길이 만큼 myString의 문자를 가져올 때 myString의 index범위를 넘어간다면
                break;                                          // break를 걸어 for문을 빠져나온다
            }
            for(int j = i; j < i + pat.length(); j++) {         // 현 index에서 pat의 길이 만큼 myString의 문자들을 가져와
                tmp += myString.charAt(j);                      // 임시 문자열 변수 tmp에 넣어준다
            }
            
            if(tmp.equals(pat)) {                               // 만약 임시 문자열 변수 tmp와 pat이 같다면
                answer++;                                       // answer에 1을 더해준다
            }
        }
        
        return answer;
    }
}