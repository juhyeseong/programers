class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String tmp = "";
        
        for(int i = 0; i < t.length(); i++) {
            if(i + p.length() - 1 < t.length()) {
                tmp = t.substring(i, i + p.length());
                
                if(Double.parseDouble(tmp) <= Double.parseDouble(p)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}