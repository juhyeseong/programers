class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(i == 0) {                            // 첫 번째 index의 원소는
                answer = array[i];                  // answer에 바로 넣어준다
            }
            else {
                boolean flag = (answer - n < 0 ? -(answer - n) : answer - n) >= (array[i] - n < 0 ? -(array[i] - n) : array[i] - n);
                boolean equal = (answer - n < 0 ? -(answer - n) : answer - n) == (array[i] - n < 0 ? -(array[i] - n) : array[i] - n);
                if(flag) {                          // 만약 answer - n의 절대값이 array[i] - n의 절댓값보다 크거나 같을 때
                    if(equal) {                     // 만약 같다면
                        if(answer > array[i]) {     // array[i]가 answer보다 작으면
                            answer = array[i];      // answer에 array[i]를 넣고
                        }
                    }
                    else {                          // 같지 않다면
                        answer = array[i];          // 그대로 answer에 array[i]를 넣어준다
                    }
                }
            }
        }
        
        return answer;
    }
}