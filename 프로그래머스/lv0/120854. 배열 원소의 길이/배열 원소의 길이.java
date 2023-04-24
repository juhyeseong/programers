class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        boolean limit = false;
        
        for(int j = 0; j < strlist.length; j++) {
        	limit = 1 <= strlist[j].length() && strlist[j].length() <= 100;
        	for(int i = 0; i < strlist.length; i++) {
        		if(answer[i] == 0 && limit) {
        			answer[i] = strlist[j].length();
        			break;
        		}
        	}
        	
        }
        
        return answer;
    }
}