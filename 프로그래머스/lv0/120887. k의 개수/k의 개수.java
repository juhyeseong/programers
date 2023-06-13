class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int num = i; num <= j; num++) {                     
            String tmp = num + "";                              // 숫자를 문자열에 넣어서
            for(int index = 0; index < tmp.length(); index++) { // 문자열의 원소 문자를 하나씩
                if((tmp.charAt(index) + "").equals(k + "")) {   // k와비교하여 같으면
                    answer++;                                   // answer에 +1
                }
            }
        }
        
        return answer;
    }
}