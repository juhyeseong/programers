class Solution {
    public String solution(String[] arr) {
        String answer = "";
        boolean limit = 1 <= arr.length && arr.length <= 200;
        
        if(limit) {
            for(int i = 0; i < arr.length; i++) {
                answer += arr[i];
            }
        }
        
        
        
        return answer;
    }
}