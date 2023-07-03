class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1 | x2) & (x3 | x4); // ∨는 OR연산이고 ∧ AND 연산이므로 다움과 같은 연산으로 계산이 가능하다
        
        return answer;
    }
}