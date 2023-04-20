class Solution {
    public int solution(int[] arr1, int[] arr2) {
	        int answer = 0;
	        boolean limitArrLength = 1 <= arr1.length && arr1.length <= 100 && 1 <= arr2.length && arr2.length <= 100;
	        boolean limitArr1Ob = false;
	        boolean isEqual = arr1.length == arr2.length;
	        int sum1 = 0, sum2 = 0;
	        
	        if(isEqual) {
	        	for(int i = 0; i < arr1.length; i++) {
	        		isEqual = 1<= arr1[i] && arr1[i] <= 100 && 1<= arr2[i] && arr2[i] <= 100;
	        		if(isEqual) {
	        			sum1 += arr1[i];
		        		sum2 += arr2[i];
	        		}
	        	}
	        	if(sum1 > sum2) {
	        		answer = 1;
	        	}
	        	else if(sum1 < sum2) {
	        		answer = -1;
	        	}
	        	else {
	        		answer = 0;
	        	}
	        }
	        else {
	        	if(arr1.length > arr2.length) {
	        		answer = 1;
	        	}
	        	else if(arr1.length < arr2.length) {
	        		answer = -1;
	        	}
	        	else {
	        		answer = 0;
	        	}
	        }
	        
	        return answer;
	    }
}