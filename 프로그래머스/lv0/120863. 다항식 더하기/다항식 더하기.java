class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");                           // polynomial문자열을 띄어쓰기를 구분자로 배열 만들기
        int num = 0;                                                    // 일반 상수들의 합을 담을 변수
        int xNum = 0;                                                   // 변수가 있는 수들의 합을 담을 변수
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].contains("x")) {                                  // arr의 index번찌 원소에 x가 포함되어 있으면
                if(arr[i].equals("x")) {                                // 만약 그 원소가 그냥 x이면
                    xNum += 1;                                          // xNum에 1을 더하고
                }
                else {                                                  // 아니면
                    xNum += Integer.parseInt(arr[i].replace("x", ""));  // 그 원소의 문자열에 x를 빼고 남은 숫자를 파싱해서 xNum에 더한다
                }
            }
            else if(!arr[i].equals("+")) {                              // 만약 x가 포함되지도 않고 문자가 +도 아니면
                num += Integer.parseInt(arr[i]);                        // num에 현 index번째의 arr 원소를 파싱한 수를 더한다
            }
        }
        
        if(xNum == 1) {                                                 // 결과에서 x의 계수가 1일 때 계수를 생략하는 코드
            if(num == 0) {
                answer = String.format("x");
            }
            else {
                answer = String.format("x + %d", num);
            }
        }
        else {
            if(xNum == 0) {                                             
                answer = String.format("%d", num);
            }
            else if(num == 0) {
                answer = String.format("%dx", xNum);
            }
            else {
                answer = String.format("%dx + %d", xNum, num);
            }
        }
        
        if(xNum == 0 && num == 0) {
            answer = "0";
        }
        
        return answer;
    }
}