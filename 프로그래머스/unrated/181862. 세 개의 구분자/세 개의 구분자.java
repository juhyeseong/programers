import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<String>();
        String filter = "abc";                              // 구분자를 필터링해 줄 변수선언                                          
        
        for(int i = 0; i < myStr.length(); i++) {
            String ch = myStr.charAt(i) + "";               
            if(!filter.contains(ch)) {                      // 만약 현 index의 문자가 구분자가 아닌 경우
            	String tmp = "";
            	for(int j = i; j < myStr.length(); j++) {   // 현 index부터 끝까지 index를 불러오는데
            		ch = myStr.charAt(j) + "";           
            		
            		if(filter.contains(ch)) {               // 이때 중간에 구분자가 있으면
            			i = j;                              // 현 index번호를 i에 전달하고
            			break;                              // break
            		}
            		else {                                  // 아니면
            			tmp += ch;                          // tmp에 현 index의 문자를 넣어준다
            		}
                    if(j == myStr.length() - 1) {           // 그리고 만약 index번호가 마지막 번호이면
            			i = j;                              // 마지막 번호를 i에 넣어준다
            		}
            	}
            	list.add(tmp);                              // tmp에 정보가 다 담아졌으면 list에 추가
            }
        }
        
        if(list.size() == 0) {                              // 만약 위 과정에서 isNull의 값이 0이면 list에 값이 없기 때문에
            list.add("EMPTY");                              // list에 "EMPTY"를 추가
        }
        
        String[] answer = new String[list.size()];          // 배열의 크기를 list의 크기로 지정해주고
        list.toArray(answer);                               // list의 정보를 answer에 담아서 반환
        
        return answer;
    }
}
