import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);                        // 중앙값을 배열의 가운데번째 index에 넣기 위해 오름차순으로 정리해준다
        
        answer = array[array.length / 2];          // index의 정가운데번째 값을 return한다
        
        return answer;
    }
}