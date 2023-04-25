class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[(num2 - num1) + 1];
        int cnt = 0;
        
        for(int i = num1; i <= num2; i++) {         // 배열을 자르기 위한 인덱스 번호만큼 숫자를 for문을 이용하여 돌려준다
            if(answer[cnt] == 0) {                  // answer[cnt]가 0이면
                answer[cnt] = numbers[i];           // answer[cnt]에 numbers[i]원소를 넣고
                cnt++;                              // answer의 인덱스값을 1 올려라
            }
        }
        return answer;
    }
}