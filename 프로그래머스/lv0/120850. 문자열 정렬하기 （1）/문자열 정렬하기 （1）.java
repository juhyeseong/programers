import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < my_string.length(); i++) {
            if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {  // 문자열의 단어들의 ASCII 코드값을 비교하여 0 ~ 9 사이 값만 골라서
                list.add(Character.getNumericValue(my_string.charAt(i)));   // 리스트에 추가한다
            }
        }
        
        list.sort(null);                        // 리스트의 sort 메서드를 이용하여 오름차순 정렬한 다음
        
        int[] answer = new int[list.size()];    // 리스트의 크기와 같은 배열을 만들고
        int index = 0;                          // 향상된 for문을 이용하기 위해 index값을 직접 넣어주고
        
        for(int tmp : list) {
            answer[index] = tmp;                // index값에 맞는 list의 원소의 값을 answer의 원소로 넣어준다
            index++;                            // index값을 점점 증가시켜준다
        }

        return answer;
    }
}