class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString = myString.toUpperCase();              // 두 문자열을 대문자로 변경해주고
        pat = pat.toUpperCase();                        
        
        if(myString.contains(pat)) {                    // pat이 myString에 포함되어있는지 판단하여
            answer = 1;                                 // 포함되어있으면 answer에 1을 대입한다
        }
        
        return answer;
    }
}