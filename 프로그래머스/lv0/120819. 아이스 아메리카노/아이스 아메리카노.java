class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cnt = 0;
        
        while(money >= 5500) {
            money = money - 5500;
            cnt++;
        }
        
        answer[0] = cnt;
        answer[1] = money;
        
        return answer;
    }
}