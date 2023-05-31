import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        ArrayList<int[]> list = new ArrayList<int[]>();                 // 반복에 따라 변환된 배열들을 담을 list 선언
        
        list.add(Arrays.copyOf(arr, arr.length));                       // list의 0번째 원소에  변환 전의 배열을 담아준다
        
        int index = 1;
        while(true) {
            for(int i = 0; i < arr.length; i++) {                       // 그 후 조건에 맞게 배열을 변환 후
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                }
                else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = (arr[i] * 2) + 1;
                }
            }
            list.add(Arrays.copyOf(arr, arr.length));                   // list에 추가
            
            if(Arrays.equals(list.get(index), list.get(index - 1))) {   // 만약 list의 현 index번째와 그 전 index번째의 배열이 같을 때
                break;                                                  // while문을 break;
            }
            index++;                                                    // 아니면 index++
        }
        
        answer = index - 1;                                             // 그리고 answer에 index - 1값을 넣어준다
        
        return answer;
    }
}