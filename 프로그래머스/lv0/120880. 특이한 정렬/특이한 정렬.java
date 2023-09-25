class Solution {
    public int[] solution(int[] numlist, int n) {
        for(int i = 0; i < numlist.length - 1; i++) {
            for(int j = i + 1; j < numlist.length; j++) {
                int iLength = numlist[i] - n > 0 ? numlist[i] - n : -(numlist[i] - n);
                int jLength = numlist[j] - n > 0 ? numlist[j] - n : -(numlist[j] - n);
                
                if(iLength > jLength || (iLength == jLength && numlist[i] < numlist[j])) {
                    int tmp = numlist[i];
                    
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                }
            }
        }        
        
        return numlist;
    }
}