class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        boolean limit = 0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100;
        
        if(limit) {
            answer = (int)((num1 / (double)num2) * 1000);
            // 1. 먼저 num2에 double타입으로 강제 형변환을하여 num1 과 num2의 나눗셈의 실수값을 구해준다.
            // 2. 다음은 1000을 곱해주면 실수값이 나오는데 그 값의 정수부분만 return되도록하기 위해
            // 3. 마지막으로 전체 결과값에 int로 강제 형변환을 해주어 정수부분만 추출한다.
        }
        
        return answer;
    }
}
