class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int index = 0;
        
        for(String element : picture) {
            String tmp = "";
            
            for(int i = 0; i < element.length(); i++) {
                for(int j = 0; j < k; j++) {
                    tmp += element.charAt(i);
                }
            }
            
            for(int i = 0; i < k; i++) {
                answer[index++] = tmp;
            }
        }
        
        return answer;
    }
}