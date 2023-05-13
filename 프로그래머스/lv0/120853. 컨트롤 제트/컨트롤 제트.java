class Solution {
    public int solution(String s) {
	        int answer = 0, cnt = 0;                // 뛰어쓰기 앞에 숫자들의 index에 기준이될 cnt 변수 선언
	        String tmp = "";                        // 숫자들을 넣어 파싱을 해줄 문자열 변수 선언
	        
	        for(int i = 0; i < s.length(); i++) {   // 문자열의 모든 원소 문자들을 비교
	            if(s.charAt(i) == 'Z') {            // 만약 i번째 원소의 문자가 'Z'이면
	                answer -= Integer.parseInt(tmp); // 앞에 숫자를 담은 tmp를 파싱한 값을 answer에서 빼라
	            }
	            tmp = "";                           // 그리고 tmp 초기화
	            if(s.charAt(i) == ' ') {            // 만약 띄어쓰기이면
	                for(int j = cnt; j < i; j++) {  // 띄어쓰기 이전의 원소 문자를 tmp에 담아라
	                    tmp += s.charAt(j);
	                }
	                if(!tmp.equals("Z")) {          // tmp가 Z가 아닐 때
	                    answer += Integer.parseInt(tmp); // answer에 tmp를 파싱한 값을 더해라
	                }
	                cnt = i + 1;                    // 그러고 띄어쓰기 이전의 값들을 담는 for문에서 이전에 담았던 단어가 안들어가게 기준이 되는 cnt를 현재의 index값에서 1을 더한 값을 넣어라
	            }
	            if(i == s.length() - 1 && s.charAt(s.length() - 1) != 'Z') {
	                for(int j = cnt; j < s.length();j++) {  // 만약 마지막 index번호이며 그 index의 원소 단어가 Z가 아닐 때
	                    tmp += s.charAt(j);                 // cnt부터 마지막 원소 단어까지 tmp에 담아라
	                }
                    answer += Integer.parseInt(tmp);        // 그 후 answer에 tmp의 파싱한 값을 answer에 더해라
	            }
	        }
	        
	        return answer;
	    }
}