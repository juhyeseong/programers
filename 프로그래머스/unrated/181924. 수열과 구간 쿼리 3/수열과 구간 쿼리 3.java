import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < queries.length; i++) {       // queries안의 i차원의 index의 배열을 불러와
            int tmp = arr[queries[i][0]];               // 현 인덱스 배열의 0번째 값을 임시변수에 저장한 다음
            arr[queries[i][0]] = arr[queries[i][1]];    // 현 인덱스 배열의 0번째 값에 1번째 값을 넣어주고
            arr[queries[i][1]] = tmp;                   // 현 인덱스 배열의 1번째 값에 임시변수의 값을 넣어준다
        }
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}