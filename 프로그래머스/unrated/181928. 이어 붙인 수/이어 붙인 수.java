class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even += num_list[i] + "";
            }
            else {
                odd += num_list[i] + "";
            }
        }
        
        int intEven = Integer.parseInt(even);
        int intOdd = Integer.parseInt(odd);
        
        answer = intEven + intOdd;
        
        return answer;
    }
}