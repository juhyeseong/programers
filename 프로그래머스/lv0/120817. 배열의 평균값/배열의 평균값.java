class Solution {
	public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0, cnt = 0;
        double avgDouble = 0;
        int avgInt = 0;
        boolean isPoint5 = false;
        boolean isPoint10 = false;
        boolean limitLength = 1 <= numbers.length && numbers.length <= 100;	// 배열의 길이 제한사항
        
        if(limitLength) {
        	for(int i = 0; i < numbers.length; i++) {	// 배열의 각 원소들의 합을 먼저 구해주기 위해 배열의 길이만큼 for문을 돌려준다
            	boolean limitNumber = 0 <= i && i <= 1000;	// 배열의 원소 제한사항
            	
            	if(limitNumber) {
            		sum += numbers[i];			// 배열의 i번째 원소를 sum 변수에 더 해주고
            		cnt += 1;				// 평균을 구하기 위해 더한 원소의 갯수를 세어준다
            	}
            }
        	avgDouble = sum / (double)cnt;				// sum과 cnt는 둘 다 int이기 때문에 double값으로 바꿔주기 위해 둘 중 하나를 double타입으로 강제 형변환해준다
        	isPoint = (((int)(avgDouble * 10)) * 10) % 5 == 0; 	// 정답의 소수부분이 .5와 .0인지 판별
        	
        	if(isPoint) {						// 정답의 소수부분이 .5, .0일 경우 그대로 답에 대입
        		answer = avgDouble;
        	}
        	else {							// 만약 .5, .0이 아니면
        		avgInt = (int)avgDouble;			// 1. int로 강제 형변환하여 소수부분을 없애 준 다음
        		answer = (double)avgInt;			// 2. double타입으로 강제 형변환하여 answer에 
        	}
        }
     
        return answer;
    }
}
