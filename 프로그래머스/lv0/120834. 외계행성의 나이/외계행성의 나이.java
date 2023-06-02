class Solution {
    public String solution(int age) {
        String answer = "";
        String result = "";
        
        while (age != 0) {
        	result += (age%10) +"";
        	age = age / 10;
        }
        char[] arr = result.toCharArray();
        
        for(int i=arr.length-1; i>=0;i--) {
        	answer += (char)(arr[i] + 49);
        }
        
        System.out.println(result);
        
        return answer;
    }
}