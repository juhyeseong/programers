class Solution {
	public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0, cnt = 0;
        double avgDouble = 0;
        int avgInt = 0;
        boolean isPoint5 = false;
        boolean isPoint10 = false;
        boolean limitLength = 1 <= numbers.length && numbers.length <= 100;
        
        if(limitLength) {
        	for(int i = 0; i < numbers.length; i++) {
            	boolean limitNumber = 0 <= i && i <= 1000;
            	
            	if(limitNumber) {
            		sum += numbers[i];
            		cnt += 1;
            	}
            }
        	avgDouble = sum / (double)cnt;
        	isPoint5 = (((int)(avgDouble) * 10) * 10) % 5 == 0;
        	isPoint10 = ((((int)avgDouble) * 10) * 10) % 10 == 0;
        	
        	if(isPoint5 && isPoint10) {
        		answer = avgDouble;
        	}
        	else {
        		avgInt = (int)avgDouble;
        		answer = (double)avgInt;
        	}
        }
     
        return answer;
    }
}