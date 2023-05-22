class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possibleArr = { "aya", "ye", "woo", "ma" };    // 가능한 발음 배열
        
        
        for(String tmp : babbling) {                            // babbling배열의 원소들
            int cnt = 0;                                        // 가능한 발음이 포함되면 그 길이를 담는 변수
            for(String possibleStr : possibleArr) {             // 가능한 발음 배열의 원소들
                if(tmp.indexOf(possibleStr) != -1) {            // 만약 bablling배열의 원소에 가능한 발음 배열의 원소로 indexOf했을 때 -1일이 나오지않으면 가능한 발음이 포함된 것이므로
                    cnt += possibleStr.length();                // 그 길이를 cnt에 저장
                }
            }
            if(tmp.length() == cnt) {                           // 만약 cnt의 크기와 bablling배열의 원소 길이가 같으면 가능한 발음들만 원소에 포함된 것이니
                answer++;                                       // answer에 +1을 해준다
            }
        }
        
        return answer;
    }
}