class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(" ");             // split을 이용하여 띄어쓰기를 구분자로 각 숫자와 기호를 문자열 배열에 담아주고
        
        for(int i = 0; i < strArr.length; i++)  {
            if(i == 0) {                                    // index의 0번째 원소는 
                answer += Integer.parseInt(strArr[i]);      // 무조건 answer에 더해준다
            }
            if(strArr[i].equals("+")) {                     // 만약 0번째 원소가 아니면서 i번째가 +랑 같으면 현 index의 다음 index번째 원소를 answer에 더해준다
                answer += Integer.parseInt(strArr[i + 1]);
            }
            if(strArr[i].equals("-")) {                     // 만약 0번째 원소가 아니면서 i번째가 -랑 같으면 현 index의 다음 index번째 원소를 answer에 빼준다
                answer -= Integer.parseInt(strArr[i + 1]);
            }
        }
        
        return answer;
    }
}