class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        boolean limit = -10000 <= numbers.length && numbers.length <= 10000;
        
        if(limit) {
            for(int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[i] * 2;
            }
        }
        
        return answer;
    }
}