class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = age + "";                                           // 나이의 앞자리수부터 차례로 비교하기 편하게 문자열로 변환한 변수
        String alpa = "abcdefghij";                                         // 0 ~ 9까지에 대항하는 알파벳을 문자열로 만든 변수
        
        for(int i = 0; i < ageStr.length(); i++) {
            answer += alpa.charAt(Integer.parseInt(ageStr.charAt(i) + "")); // 나이의 현 index번째 있는 자릿수의 숫자의 index번째 alpa 원소를 answer에 추가
        }
        
        return answer;
    }
}