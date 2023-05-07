class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int cnt = 0;
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                cnt++;                                       // answer의 크기를 지정해 주기 위한 코드
            }
        }
        String[] answer = new String[cnt];
        
        for(int i = 0; i < finished.length; i++) {          
            if(!finished[i]) {                              // finished의 i번째 원소가 false일 때
                for(int j = 0; j < answer.length; j++) {
                    if(answer[j] == null) {                 // answer의 원소 중 비어있는 가장 앞에 있는 원소에
                        answer[j] = todo_list[i];           // i번째 원소의 todo_list 원소를 넣어준다
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}