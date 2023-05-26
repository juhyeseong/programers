import java.util.*;
class Solution {
   public int solution(String[] strArr) {
        int answer = 0;
        ArrayList<Integer> lengthList = new ArrayList<Integer>();	// 문자열 길이
        ArrayList<Integer> cntList = new ArrayList<Integer>();    //문자열 목록
        
        for(String str : strArr) {                                // 문자열 배열 strArr의 원소들의 문자열 길이의 종류를 담는 연산
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
        
        for(int i = 0; i < lengthList.size(); i++) {               // 문자열의 길이 별 갯수를 담는 연산
        	int cnt = 0;
        	
        	for(String str : strArr) {
        		if(lengthList.get(i) == str.length()) {
        			cnt++;
        		}
        	}
        	cntList.add(cnt);
        }
        
        cntList.sort(Comparator.reverseOrder());                     // 문자열의 길이 별 갯수 내림차순
         
        answer = cntList.get(0);                                     // 내림차순이니 리스트의 첫 번째 값이 갯수가 가장 큰 집합
        
        return answer;
    }
}
