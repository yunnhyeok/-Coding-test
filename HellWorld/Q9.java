import java.util.Scanner;

public class Q9 {
    public static void main(String args[]) {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하시오 : ");
        i = s.nextInt();
        recursive(i);
        s.close();
    }

    static int recursive(int n){
        int i;
        if ( n< 1)
            return 2;
        else {
            i = (2 * recursive(n - 1) ) + 1;
            System.out.println(i);
            return i;
        }
    }
}

// 이 코드는 자기 자신을 호출하고 n-1 값 만큼 반복 수행되는 재귀함수이다. recursive(n - 1) 이 부분이 재귀함수인 증거이다.
// 키보드에 5를 입력하게되면. i는 5가되고 recursive(i); 안에 5가 들어간다. 그리고 n 또한 5가된다.
// if (n<1)에서 5<1 이므로 else로 가게 되면 i = 2 * recursive(4)가 되고 + 1 을 하여 11이 된다.
// 재귀 함수 이므로 recursive(4) > 3 > 2 > (1)까지 전부 실행해야한다.