class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        
        for(int i = 0; i < board.length; i++) { 
            for(int j = 0; j < board[i].length; j++) {
                if(i + j <= k) {                        // 만약 i + j <= k를 만족 할 때
                    answer += board[i][j];              // answer에 더한다
                }
            }
        }
        
        return answer;
    }
}