class Solution {
    public int[] solution(int[] arr) {
        int num = 1;                    // 2 ^ 0 = 1이기 때문에 최소 배열의 길이는 1로 주고
        
        if(arr.length > 1) {            // 만약 arr의 길이가 1보다 클 때
            num = 2;                    // 2의 거듭제곱이 될 수 있는 초기값 2를 넣어준다
        }
        
        while(num < arr.length) {       // arr의 길이보다 커지기 전까지
            num *= 2;                   // num에 2를 계속 곱한다
        }
        
        int[] answer = new int[num];    // answer의 크기를 num으로 지정하고
        int index = 0;                 
        
        for(int tmp : arr) {      
            answer[index] = tmp;
            index++;
        }
        
        return answer;
    }
}