class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int index = 0;
        
        for(int i = 0; i < myString.length(); i++) {
            String tmp = "";                                    // myString에서 pat의 길이만큼 슬라이싱해서 pat과 비교할 임시 문자열 변수를 선언
            if((i + pat.length() - 1) == myString.length()) {   // 만약 슬라이싱할 때 myString의 index크기를 넘을 시에
                break;                                          // break
            }
            for(int j = i; j < i + pat.length(); j++) {         // pat의 길이만큼 myString을 차례로 슬라이싱
                tmp += myString.charAt(j);                      // 슬라이싱 한 값을 tmp에 저장
                if(pat.equals(tmp)) {                           // pat과 tmp를 비교해서 같으면
                    index = i + pat.length();                   // 현 index의 끝 번호를 index번호에 저장
                }
            }
        }
        
        for(int i = 0; i < index; i++) {                        // 0에서 마지막으로 index의 저장된 값까지의 원소를
            answer += myString.charAt(i);                       // answer에 저장하여 반환한다
        }
        
        return answer;
    }
}