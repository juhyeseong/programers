import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();    // rank의 학생 번호와 등수를 같이 담아 줄 HashMap 변수 선언
        
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {                                                 // 현 index번째의 attendance가 true이면
                rankMap.put(rank[i], i);                                        // key값에 등수를, value에 학생 번호를 넣어준다
            }
        }
        
        List<Integer> keySet = new ArrayList<Integer>(rankMap.keySet());        // 등수(key값)를 담아줄 List변수 선언
        
        keySet.sort(null);                                                      // 등수(key값)을 오름차순으로 정렬
        
        answer = (rankMap.get(keySet.get(0)) * 10000) + (rankMap.get(keySet.get(1)) * 100) + rankMap.get(keySet.get(2));
                                                                                // 등수(key값)이 오름차순 되었으니 keySet의 0, 1, 2번째 있는 key값의 rankMap의 value값이 각각 a, b, c이다
        return answer;
    }
}