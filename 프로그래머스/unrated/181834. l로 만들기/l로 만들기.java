class Solution {
    public String solution(String myString) {
        String answer = myString;
        
        for(int i = 0; i < answer.length(); i++) {
            if(answer.charAt(i) < 'l') {                                      // 문자열의 원소가 l보다 앞서는 문자이면
                answer = answer.replaceAll(answer.charAt(i) + "", "l");     // replaceAll을 통해 l로 바꿔준다
            }
        }
        
        return answer;
    }
}