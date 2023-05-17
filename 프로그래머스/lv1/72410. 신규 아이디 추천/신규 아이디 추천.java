class Solution {
    public String solution(String new_id) {
        String answer = "";
        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        new_id = new_id.toLowerCase();
        
        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
//        answer = answer.replaceAll("[^a-z0-9-_.]", "");	// 정규식 사용
        String filter = "abcdefghijklmnopqrstuvwxyz0123456789-_.";
        for(int i=0; i<new_id.length();i++) {
        	String ch = new_id.charAt(i) + "";
        	if(filter.contains(ch)) {
        		answer += ch;
        	}
        }
        
        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        // 점이 두개가 있을 때 그것을 반복으로 계속 두개는 하나로 만드는 작업
        while(answer.contains("..")) {
        	answer = answer.replace("..", ".");
        }
        
        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if(answer.startsWith(".")) {
        	answer = answer.substring(1);
        }
        // if는 한번 확인하면 끝나기 때문에 else if로 처리하지 않았음
        if(answer.endsWith(".")) {
        	answer = answer.substring(0, answer.length()-1);
        }
        
        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        while(answer.equals("")) {
        	answer ="a";
        }
        
        // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        
        if(answer.length() >= 16) {
        	answer = answer.substring(0,15);
        }
        if(answer.endsWith(".")){
            answer = answer.substring(0, answer.length()-1);
        }
        
        // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        while(answer.length() <= 2) {
        	answer += answer.substring(answer.length()-1);
        }
        
        return answer;
    }
}