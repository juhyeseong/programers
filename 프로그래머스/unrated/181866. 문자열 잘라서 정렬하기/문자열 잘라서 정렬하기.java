import java.util.*;
class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<String>();
        String tmp = "";                                                        // x가 나오기 전의 문자열을 담아둘 임시 문자열 변수
        
        for(int i = 0; i < myString.length(); i++) {                            // myString의 모든 문자를 비교
            if(myString.charAt(i) == 'x') {                                     // i번째 문자가 x일 때
                if(!tmp.equals("")) {
                    list.add(tmp);                                                  // 현재까지 담았던 문자열을 list에 추가한 다음
                }
                tmp = "";                                                       // tmp를 초기화시켜준다
            }
            else {                                                              // x가 아닐 때는
                tmp += myString.charAt(i);                                      // 문자를 tmp에 담아준다
            }
            
            if((i == myString.length() - 1) && myString.charAt(i) != 'x') {     // 만약 마지막 문자가 x가 아니면
                if(!tmp.equals("")) {
                    list.add(tmp);                                              // 현재까지 담았던 문자열인 tmp를 리스트에 추가하고 끝낸다
                }
            }
        }
        
        list.sort(null);                                                        // 현재까지 담은 list를 오름차순으로 정렬한 다음
        
        String[] answer = new String[list.size()];                              // list의 크기 만큼 배열의 크기를 지정해주고
        list.toArray(answer);                                                   // list의 모든 원소를 배열에 담아서 반환한다
        
        return answer;
    }
}