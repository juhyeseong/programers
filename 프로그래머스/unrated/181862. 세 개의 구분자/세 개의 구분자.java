import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<String>();
        String filter = "abc";
        
        for(int i = 0; i < myStr.length(); i++) {
            String ch = myStr.charAt(i) + "";
            if(!filter.contains(ch)) {
            	String tmp = "";
            	for(int j = i; j < myStr.length(); j++) {
            		ch = myStr.charAt(j) + "";
            		
            		if(filter.contains(ch)) {
            			i = j;
            			break;
            		}
            		else {
            			tmp += ch;
            		}
                    if(j == myStr.length() - 1) {
            			i = j;
            		}
            	}
            	list.add(tmp);
            }
        }
        
        if(list.size() == 0) {                                                            // 만약 위 과정에서 isNull의 값이 0이면 list에 값이 없기 때문에
            list.add("EMPTY");                                                            // list에 "EMPTY"를 추가
        }
        
        String[] answer = new String[list.size()];                                        // 배열의 크기를 list의 크기로 지정해주고
        list.toArray(answer);                                                             // list의 정보를 answer에 담아서 반환
        
        return answer;
    }
}