class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = my_string.length() - 1; i >= 0; i--) {  // my_string의 인덱스번호를 반대순번으로 for문을 돌린다
            answer += my_string.charAt(i);                  // 반대순번을 순차적으로 받아 그 인덱스의 값을 answer에 추가한다
        }
        
        return answer;
    }
}