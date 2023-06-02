class Solution {
    public int solution(int n) {
      		int answer = 0;
		if (n == 1) {
			answer = 1;
		} else if (n == 2) {
			answer = 1;
		} else if (n == 5) {
			answer = 5;
		} else {

			for (int i = 1; i <= n; i++) {
				if ((i * n) % 6 == 0) {
					answer = (i * n) / 6;
					break;
				}
			}
		}
		return answer;
    }
}