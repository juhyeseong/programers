class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        answer = str1.contains(str2) ? 1 : 2;   // str2의 문자열이 str1에 포함되면 answer에 1을, 그렇지 않으면 2를 반환
        
        return answer;
    }
}