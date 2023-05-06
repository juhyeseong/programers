class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        for(int i = 0; i < num_list.length; i++) {                  // num_list의 원소의 갯수만큼 index번호를 돌린다
            if(i < n) {                                             // index번호가 n보다 작을 때
                answer[i + (num_list.length - n)] = num_list[i];    // answer의 index번호를 num_list의 현 index번호에 num_list의 길이에서 n값을 뺀 값을 더해 그 index번호에 값을 넣는다
            }
            else {                                                  // index번호가 n보다 크거나 같을 때는
                answer[i - n] = num_list[i];                        // 현 index번호에 n을 뺀 answer의 index번호에 값을 넣는다
            }
        }
        
        return answer;
    }
}