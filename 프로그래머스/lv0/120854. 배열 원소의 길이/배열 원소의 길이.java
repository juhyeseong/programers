class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];         // strlist의 윈소의 길이를 담는 배열이기 때문에 strlist와 크기가 같다
        
        for(int i = 0; i < strlist.length; i++) {       // strlist의
        	answer[i] = strlist[i].length();            // i번째 원소의 길이를 answer의 i번째에 대입
        }
        
        return answer;
    }
}