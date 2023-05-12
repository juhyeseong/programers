import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i = 0; i < a.length(); i++) {   // a 문자열의 원소 문자를 하나하나 들고온다
            System.out.println(a.charAt(i));    // 줄바꿈 출력으로 단어 하나씩 출력한다
        }
    }
}