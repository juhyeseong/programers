class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) { // array의 모든 원소를 확인하기 위해 인덱스값을 array의 크기 만큼 돌리고
            if(array[i] == n) {                 // array의 원소와 n의 값을 비교하여 같으면
                answer++;                       // answer에 1을 더 한다
            }
        }
        
        return answer;
    }
}