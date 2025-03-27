public class Q5 {
    public static void main(String args[]){
        int a = 26;
        int b = 91;
        int g = 0;
        int c = a < b ? a : b;
        for(int i = 1; i < c; i++){
            if(a % i == 0 && b % i == 0)
            g = i;
        }
        System.out.println(g);

    }

}
// 이 문제는 a 26과 b 91의 최대공약수를 찾는 문제여서 13이 정답으로 나왔지만 1도 최대공약수가 되지 않을까? 생각했다.
// 하지만 1은 최대공약수가 될 수 있지만 최대 공약수 이므로 1보다 큰 숫자 13이 정답이 된다. 수학에서 손 놓은지 너무 오래되서 까먹었다!