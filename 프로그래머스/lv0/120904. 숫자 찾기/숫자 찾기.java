class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String result = "";
        while(num !=0) {
        	result += num%10 +"";
        	num = num /10;
        }
        System.out.println(result);
        char[] arr = result.toCharArray();
        int count =0;
        for(int i =arr.length-1; i>=0;i--) {
        	if (arr[i] - '0' == k) {
        		count++;
        		answer = count;
        		break;
        	}
        	count++;
        }
        
        return answer;
    }
}