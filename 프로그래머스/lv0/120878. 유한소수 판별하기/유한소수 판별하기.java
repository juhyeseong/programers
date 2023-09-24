import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int max = 0;
        int index = 2;
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        
        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        b /= max;
        
        while(b != 1) {
            if(b % index == 0) {
                b /= index;
                primeFactors.add(index);
            }
            else {
                index++;
            }
        }
        
        for(int primeFactor : primeFactors) {
            if(primeFactor != 2 && primeFactor != 5) {
                return 2;
            }
        }
        
        return answer;
    }
}