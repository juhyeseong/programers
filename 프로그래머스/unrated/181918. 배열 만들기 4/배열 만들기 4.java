import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int index = 0;
        while(index != arr.length) {
            if(list.size() == 0) {                          // list가 비어있으면
                list.add(arr[index]);                       // 리스트에 index번째 값을 추가
                index++;                                    // index에 +1
            }
            if(list.get(list.size() - 1) < arr[index]) {    // list의 마지막 원소가 arr[index]값 보다 작으면
                list.add(arr[index]);                       // list에 추가
                index++;
            }
            else {                                          // list의 마지막 원소가 arr[index]값 보다 크거나 같으면
                list.remove(list.size() - 1);               // list의 마지막 원소를 제거한다
            }
        }
        
        return list;
    }
}