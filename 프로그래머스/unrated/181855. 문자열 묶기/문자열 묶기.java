import java.util.*;
class Solution {
   public int solution(String[] strArr) {
        int answer = 0;
        ArrayList<Integer> lengthList = new ArrayList<Integer>();	// 문자열 길이
        ArrayList<Integer> cntList = new ArrayList<Integer>();//문자열 목록
        
        for(String str : strArr) {
        	if(lengthList.size() == 0) {
        		lengthList.add(str.length());
        	}
        	else {
        		boolean isEqual = false;
        		for(int i = 0; i < lengthList.size(); i++) {
        			if(lengthList.get(i) == str.length()) {
        				isEqual = true;
        			}
        			if(i == lengthList.size() - 1) {
        				if(!isEqual) {
        					lengthList.add(str.length());
        				}
        			}
        		}
        	}
        }
        
        lengthList.sort(null);
        
        for(int i = 0; i < lengthList.size(); i++) {
        	int cnt = 0;
        	
        	for(String str : strArr) {
        		if(lengthList.get(i) == str.length()) {
        			cnt++;
        		}
        	}
        	cntList.add(cnt);
        }
        
        cntList.sort(Comparator.reverseOrder());
        
        answer = cntList.get(0);
        
        return answer;
    }
}