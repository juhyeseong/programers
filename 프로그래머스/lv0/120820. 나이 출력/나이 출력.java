class Solution {
    public int solution(int age) {
        int answer = 0;
        boolean limitAge = 0 < age && age <= 120;
        
        if(limitAge) {
            answer = 2022 - age + 1;
        }
        
        return answer;
    }
}