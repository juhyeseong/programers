class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = { 0, 0 };
        
        int width = board[1] / 2;                               // 가로 +-최대 길이
        int height = board[0] / 2;                              // 세로 +-최대 길이
        
        
        for(String tmp : keyinput) {
            if(tmp.equals("up") && answer[1] < width) {         // 키가 up이고 가로좌표가 width보다 작을 때
                answer[1]++;                                    // answer의 가로좌표에 +1을
            }
            else if(tmp.equals("down") && answer[1] > -width) { // 키가 down이고 가로좌표가 -width보다 클 때
                answer[1]--;                                    // answer의 가로좌표에 -1을
            }
            else if(tmp.equals("left") && answer[0] > -height) {// 키가 left이고 세로좌표가 -height보다 클 때
                answer[0]--;                                    // answer의 세로좌표에 -1을
            }
            else if(tmp.equals("right") && answer[0] < height) {// 키가 right이고 세로좌표가 height보다 작을 때
                answer[0]++;                                    // answer의 세로좌표에 +1을 해준다
            }
        }
        
        return answer;
    }
}