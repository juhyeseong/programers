class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int index = 0;
        for(String str : quiz) {                                                        // quiz의 원소 문자열을 하나씩
            String[] strArr = str.split(" ");                                           // 띄어쓰기를 구분자로 문자열 배열 strArr을 만든다
            if(strArr[1].equals("+")) {                                                 // strArr의 1번째 원소가 +이면
                int result = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[2]); // 더하기 연산을 하여
                if(Integer.parseInt(strArr[4]) == result) {                             // 그 결과가 strArr의 4번째 원소와 값이 갔다면
                    answer[index] = "O";                                                // O를 담고
                }
                else {                                                                  // 아니면 X를 담는다
                    answer[index] = "X";    
                }
            }
            else if(strArr[1].equals("-")) {                                            // 연산자만 다르고 그 뒤는 +연산과 동일하게 진행한다
                int result = Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2]);
                if(Integer.parseInt(strArr[4]) == result) {
                    answer[index] = "O";
                }
                else {
                    answer[index] = "X";
                }
            }
            index++;
        }
        
        return answer;
    }
}