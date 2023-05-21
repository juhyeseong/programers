class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int num : num_list) {           // num_list의 원소를 불러와서
            while(num != 1) {               // 원소가 1이 될 때까지 나눠준다
                if(num % 2 == 0) {          // 만약 짝수이면
                    num = num / 2;          // 2로 나누고
                }
                else {                      // 홀수이면
                    num = (num - 1) / 2;    // 1을 뺀 값을 2로 나눠준다
                }
                answer++;                   // 나눈 횟수를 세기 위해 answer에 + 1을 해준다
            }
        }
        
        return answer;
    }
}