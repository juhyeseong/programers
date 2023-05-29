class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int index = 0;                          // answer의 index를 세기 위한 변수
        
        for(int i = 0; i < arr.length; i++) {
            if(index == answer.length) {        // index가 answer의 크기랑 동일하면
                break;                          // break
            }
            
            boolean isEquals = false;           // arr의 i번째 수가 answer에 있는지 판별하는 변수
            
            for(int j = 0; j < index; j++) {
                if(arr[i] == answer[j] && index != 0) { // arr의 i번째 수가 answer에 있으면
                    isEquals = true;                    // isEquals는 true
                }
            }
            if(!isEquals) {                             // isEquals가 false일 때
                answer[index] = arr[i];                 // answer의 index번째에 arr의 i번째 수를 넣어준다
                index++;                                // 그 후에 index에 +1을 해준다
            }
        }
        if(index != answer.length) {                    // 만약 answer의 배열을 꽉 채워주지 못했다면
            for(int i = index; i < answer.length; i++) {
                answer[i] = -1;                         // 나머지는 -1로 채워준다
            }
        }
        
        return answer;
    }
}