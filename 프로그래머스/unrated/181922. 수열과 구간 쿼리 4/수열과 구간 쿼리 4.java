class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int index = 0;
        
        for(int[] query : queries) {
            for(int i = query[0]; i <= query[1]; i++) {
                if(i % query[2] == 0) {
                    arr[i]++;
                }
            }
            index++;
        }
        
        return arr;
    }
}