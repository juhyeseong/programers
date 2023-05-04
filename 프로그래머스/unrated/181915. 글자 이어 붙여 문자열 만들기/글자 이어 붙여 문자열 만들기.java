class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for(int i = 0; i < index_list.length; i++) {    // my_string의 index번호를 담은 index_list를 차례로 꺼낸다
            answer += my_string.charAt(index_list[i]);  // 해당 index번째의 my_string의 문자를 answer문자열에 추가한다
        }
        
        return answer;
    }
}