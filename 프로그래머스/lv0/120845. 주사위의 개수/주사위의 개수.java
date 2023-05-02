class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;                        // 처음 자신과 대상을 곱했을 때 대상의 값이 나오게 하기 위해
                                               // answer의 값을 1로 준비한다
        
        for(int i = 0; i < box.length; i++) {  // box의 길이 만큼 for문을 돌려주고
            answer *= box[i] / n;              // 해당 인덱스번의 원소와 n을 나눈 몫을 answer와 곱한 뒤 answer에 담는다
        }
        
        return answer;
    }
}