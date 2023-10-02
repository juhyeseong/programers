import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int size = 1;
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]) {
                arr[size] = arr[i];
                size++;
            }
        }
        
        int[] answer = new int[size];
        
        System.arraycopy(arr, 0, answer, 0, size);

        return answer;
    }
}