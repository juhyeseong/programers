class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int size = my_string.length() - is_suffix.length() - 1;
    
        if(my_string.length() >= is_suffix.length()) {
            my_string = my_string.substring(my_string.length() - is_suffix.length(), my_string.length());
            if(my_string.contains(is_suffix)) {
                answer = 1;
            }
        }
        
        
        return answer;
    }
}