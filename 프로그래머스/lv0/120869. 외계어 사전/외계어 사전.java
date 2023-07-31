class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;                                    
        
        for(String element : dic) {                         
            int count = 0;                                  // dic의 원소 문자열에서 포함하는 spell의 갯수
            
            for(int i = 0; i < spell.length; i++) {
                if(element.contains(spell[i]) == true) {    // 만약 dic의 원소 문자열에서 spell[i]의 문자를 포함하면
                    count++;                                // 갯수를 샌다
                }
            }
            
            if(count == spell.length) {                     // dic의 원소 문자열에서 spell의 문자들을 포함하는 갯수가 spell의 크기와 같다면
                return 1;                                   // 1을 반환하고 메서드를 종료
            }
            else {                                          // 아니면 answer에 2를 담아준다
                answer = 2;
            }
        }
        
        return answer;
    }
}