import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxCnt = 0;
        Set<Integer> elements = new HashSet<Integer>();             // 숫자의 가지를 담아 줄 set 변수
        ArrayList<Integer> cnts = new ArrayList<Integer>();         // 갯수를 담을 리스트 변수
        ArrayList<Integer> elementsList = new ArrayList<Integer>(); // 숫자 가지를 담은 set을 출력을 위해 담아줄 리스트 변수
        
        for(int tmp : array) {
            elements.add(tmp);                                      
        }
        
        for(int element : elements) {                   // 숫자의 가지를 차례로 비교한다
            int cnt = 0;
            for(int i = 0; i < array.length; i++) {
                if(element == array[i]) {               // array와 현 숫자 가지와 같으면
                    cnt++;                              // 갯수에 + 1
                }
            }
            if(maxCnt < cnt) {                          // 가장 큰 수를 구하는 if문
            	maxCnt = cnt;                           
            }
            cnts.add(cnt);                              // 갯수를 담을 리스트에 갯수를 담고
            elementsList.add(element);                  // 현 숫자의 가지를 담을 리스트에 추가
                                                        // 이렇게되면 갯수와 숫자의 가지가 같은 index에 담긴다
        }
        
        int max = 0;
        for(int cnt : cnts) {                           // 만약 갯수의 원소중
        	if(maxCnt == cnt) {                         // maxCnt와 같은 원소가
        		max++;                                  
        	}
        }
        if(max > 1) {                                   // 1초과이면
        	answer = -1;                                // answer에 -1
        }
        else {                                          // 아니면
        	for(int i = 0; i < elements.size(); i++) {
        		if(cnts.get(i) == maxCnt) {             // maxCnt와 같은 cnts원소의 index와 같은
        			answer = elementsList.get(i);       // index번째의 elementsList의 원소를 answer에 넣는다
        		}
        	}
        }
        
        return answer;
    }
}