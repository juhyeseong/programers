class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] strNumber = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };    // 숫자를 문자열로 표현한 문자열배열 준비
        String[] number = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }; // 숫자를 숫자로 표현한 문자열배열 준비

        for(int i = 0; i < number.length; i++) {                    // 배열의 길이만큼 index번호
            numbers = numbers.replaceAll(strNumber[i], number[i]);	// strNumber의 i번째 원소를 number의 i번째 원소로 바꾼다
        }

        answer = Long.parseLong(numbers);                           // 바뀐 문자열을 Long 타입으로 파싱한다

        return answer;
    }
}