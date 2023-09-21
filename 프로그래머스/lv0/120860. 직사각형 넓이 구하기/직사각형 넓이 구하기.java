class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int xMax = -256, xMin = 256, yMax = -256, yMin = 256;
        int width = 0, height;
        
        for(int[] dot : dots) {
            if(dot[0] > xMax) {
                xMax = dot[0];
            }
            if(dot[0] < xMin) {
                xMin = dot[0];
            }
            if(dot[1] > yMax) {
                yMax = dot[1];
            }
            if(dot[1] < yMin) {
                yMin = dot[1];
            }
        }
        
        width = xMax - xMin;
        height = yMax - yMin;
        answer = width * height;
        
        return answer;
    }
}