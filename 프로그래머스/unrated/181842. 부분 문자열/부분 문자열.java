class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        if(str2.contains(str1)) {   // 만약 str2에 str1이 포함되어있으면
            answer = 1;             // 1을 반환
        }
        
        return answer;
    }
}