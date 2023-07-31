class Solution {
    public int[][] solution(int[][] arr) {
        int length = arr.length > arr[0].length ? arr.length : arr[0].length;   // 정사각형으로 만들기 위해 행의 수와 열의 수 중 더 큰 값을 길이로 정해준다
        int[][] answer = new int[length][length];                               // 위에서 정한 길이를 answer의 행과 열의 길이로 지정
        
        for(int i = 0; i < answer.length; i++) {                                // 2차원 for문을 answer의 크기 만큼 반복하는데
            for(int j = 0; j < answer[i].length; j++) {
                if(arr.length <= i || arr[i].length <= j) {                     // 만약 arr의 행의 크기가 i보다 작거나 arr의 열의 크기가 j보다 작으면 answer[i][j]에 0을 대입
                    answer[i][j] = 0;
                }
                else {                                                          // 아니면 arr[i][j]를 대입
                    answer[i][j] = arr[i][j];
                }
            }
        }
        
        return answer;
    }
}