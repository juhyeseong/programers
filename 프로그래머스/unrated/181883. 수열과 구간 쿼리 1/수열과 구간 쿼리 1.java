class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int index = 0;
        
        for(int[] query : queries) {
            for(int i = query[0]; i <= query[1]; i++) { // s ~ e 사이의 모든 index번째의
                arr[i]++;                               // arr원소에 + 1
            }
            index++;                                        
        }
        
        return arr;
    }
}