class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;

        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {      // num_list의 i번째 인덱스의 값이 짝수이면
                even++;                     // 짝수의 갯수를 하나 올려라
            }
        }
        odd = num_list.length - even;       // num_list의 배열의 전체 갯수에서 짝수의 갯수를 빼면 홀수의 갯수가 나온다
        
        answer[0] = even;
        answer[1] = odd;
        
        return answer;
    }
}