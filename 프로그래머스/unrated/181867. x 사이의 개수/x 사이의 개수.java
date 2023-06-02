class Solution {
    public int[] solution(String myString) {
      int[] answer = {};
        
        if(myString.endsWith("x")) {
        	myString += " ";
        }

        
        String[] arr = myString.split("x");
        

        
        for(int i=0; i<arr.length;i++) {
        	arr[i] = arr[i].replace(" ", "");
        }
        
        answer = new int[arr.length];
        
        for(int i=0; i<answer.length;i++) {
        	answer[i] = arr[i].length();
        }
        
        return answer;
    }
}