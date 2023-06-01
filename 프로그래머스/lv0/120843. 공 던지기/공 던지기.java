class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 0;
        int index = 0;
        
        while(cnt != k) {                           // cnt가 k와 같은 값이 될 때 까지
            if(index >= numbers.length) {           // 만약 index가 numbers의 크기보다 크거나 같을 때
                index = index - numbers.length;     // index에 numbers의 크기를 뺀다
            }
            
            answer = numbers[index];                // answer는 공을 넘겨받은 사람
            index += 2;                             // 공을 넘겨 받은 후 현 index + 2에게 공을 던져준다
            cnt++;                                  // 공을 던진 횟수를 추가
        }
        
        return answer;
    }
}