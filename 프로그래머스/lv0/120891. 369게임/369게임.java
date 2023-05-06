class Solution {
    public int solution(int order) {
        int answer = 0;
        
        // order의 숫자를 뒤에서 하나씩 빼내는 코드
        while(order != 0) {                                 // order가 0이 될 때까지
            if((order % 10) % 3 == 0 && order % 10 != 0) {  // order에서 빼낸 숫자가 3의 배수일 때
                answer++;                                   // 박수의 갯수를 1개 추가
            }
            order /= 10;                                    // 마지막 숫자를 빼낸 숫자를 제외한 숫자를 order에 다시 넣기
        }
        
        return answer;
    }
}