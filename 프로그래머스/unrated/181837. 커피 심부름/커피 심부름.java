class Solution {
    public int solution(String[] order) {
        int answer = 0;
        boolean limit = 1 <= order.length && order.length <= 1000;
        
        if(limit) {
            for(int i = 0; i < order.length; i++) {
                if(order[i].equals("icecafelatte") || order[i].equals("cafelatteice") || order[i].equals("hotcafelatte") || order[i].equals("cafelattehot") || order[i].equals("cafelatte")) {
                    answer += 5000;
                }
                else {
                    answer += 4500;
                }
            }
        }
        
        
        return answer;
    }
}