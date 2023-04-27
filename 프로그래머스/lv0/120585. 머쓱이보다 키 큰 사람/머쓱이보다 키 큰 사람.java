class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {     // 키를 비교하기 위해 array의 모든 원소를 불러 줄 인덱스값을 돌려준다
            if(array[i] > height) {                 // i번째 인덱스값의 원소와 heghit의 값을 비교하여 height보다 크면
                answer++;                           // answer에 1을 더해 카운터해준다
            }
        }
        
        return answer;
    }
}