class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = new int[6];
        
        for(int i = 0; i < arr.length; i++) {               // a, b, c, d가 나온 숫자에 -1한 index번째에 카운터를 세준다
            if(i + 1 == a) {                                // 베얄의 index에 + 1한 값이 곧 주사위의 눈 갯수이다
                arr[i]++;
            }
            if(i + 1 == b) {
                arr[i]++;
            }
            if(i + 1 == c) {
                arr[i]++;
            }
            if(i + 1 == d) {
                arr[i]++;
            }
        }
        
        int index = 1;                                                                  // 주사위의 눈 갯수
        for(int number : arr) {                                                         // 눈 갯수별 배열의 원소를 하나씩 대입해서
            if(number == 4) {                                                           // 원소의 값중 4가 있다면
                answer = 1111 * index;                                                  // 네 주사위에서 나온 숫자가 모두 같을 때의 연산을 해주고
            }
            else if(number == 3) {                                                      // 현 index번째의 원소가 3이면
                for(int i = 0; i < arr.length; i++) {                                   // 배열에서
                    if(arr[i] == 1) {                                                   // 원소가 1인 index번을 찾아
                        answer = (10 * (index) + (i + 1)) * (10 * (index) + (i + 1));   // index를 이용하여 같은 숫자 3개와 다른 숫자 1개가 나온 연산을 해주고
                        break;                                                          // 배열에서 원소가 1인 index를 찾는 반복문을 중단 시킨다
                    }
                }
            }
            else if(number == 2) {                                                      // 만약 배열의 원소 중 현 index번째의 원소가 2이면
                for(int i = 0; i < arr.length; i++) {                                   // 배열의 원소 중
                    if(arr[i] == 2 && i + 1 != index) {                                 // 만약 i + 1이 현 index번째가 아니면서 원소 중 2가 또 있다면
                        if(index - (i + 1) < 0) {                                       // 같은 숫자가 두개씩 나온 연산을 해주고
                            answer = (index + i + 1) * -(index - (i + 1));
                        }
                        else {                      
                            answer = (index + i + 1) * (index - (i + 1));
                        }
                    }
                    else if(arr[i] == 1) {                                               // 원소 중 2가 안나오고 1이 나왔다면
                        if(answer == 0) {                                                // 그러고 answer가 0이면
                          answer = 1;                                                    // 곱셈의 항등원인 1을 넣어주고
                        }
                        answer *= i + 1;                                                 // 그 후 원소가 1인 index값에 1을 더한 값을 answer에 곱해준다
                    }
                }
            }
            
            index++;
        }
        
        int min = 6;                                                                     // 그러고 만약 answer에 값이 담기지 않았다면
        if(answer == 0) {
            for(int i = 0; i < arr.length; i++) {                                        // 네 주사위에 적힌 숫자가 모두 다른 연산을 해준다
                if(arr[i] != 0) {
                    if((i + 1) < min) {
                        min = i + 1;
                    }
                }
            }
            
            answer = min;
        }
        
        return answer;
    }
}