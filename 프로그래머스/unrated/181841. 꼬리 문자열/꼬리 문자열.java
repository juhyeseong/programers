class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for(String tmp : str_list) {                    // 배열에 있는 문자열 원소들을 차례로 가져온다
            int isEqual = 0;                            // ex의 문자중 같은 문자가 있는지 판별
            
            for(int i = 0; i < tmp.length(); i++) {     // tmp의 원소를 하나씩 가져오고
                for(int j = 0; j < ex.length(); j++) {  // ex의 원소도 하나씩 가져와서
                    if(tmp.charAt(i) == ex.charAt(j)) { // 둘을 비교하여 같은 문자가 있으면
                        isEqual++;                      // isEqual에 1을 더한다
                    }
                }
            }
            
            if(isEqual < ex.length()) {                 // 만약 ex의 길이보다 isEqual의 숫자가 작다면 같은 단어가 있다하여도 모두 다 포함하지 않은 것이기 때문에
                                                        // ex의 길이보다 isEqual의 숫자가 작다면
                answer += tmp;                          // tmp를 answer에 추가해준다
            }
        }
        
        return answer;
    }
}