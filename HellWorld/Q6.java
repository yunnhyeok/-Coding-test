public class Q6 {
    public static void main(String args[]){
        int a = 0, ss = 0;
        while(true) {
            if(ss > 100) break;
            ++a;
            ss += a;
        }
        System.out.print(a + ss);
    }

}

//풀이! a = 0 , ss = 0 이고, while로 true가 나올때까지 반복
//if ss가 100보다 크면 break.
//그전까지는 a를 전위증가해주고 ss = ss+a를 해준다.
//ss>100이므로 a=1로 증가, ss = 0 + 1 이 된다.
//계속 반복. a=2 , ss = 1 + 2 =3
//a=3 , ss = 3 + 3 = 6
//a=4 , ss = 6+4 = 10
//a=5 , ss = 10 + 5 = 15
//a=6 , ss = 15 + 6 = 21
//a=7 , ss = 21 + 7 = 28
//a=8 , ss = 28 + 8 =36
//a=9 , ss = 36 + 9 = 45
//a=10 , ss=45+10 =55
//a=11 , ss = 55+11 =66
//a=12 , ss = 66+12 = 78
//a=13 , ss=78+13 = 91
//a=14 , ss = 91 +14 =105 << 100이상이므로, break
//a=14이고, ss는 105가 된다.
//91이 아니라 105인 이유는 91은 100이하 이므로 break가 되지않는다! 즉 105까지 도달해서야 break가 발동되서 ss는 105가된다!
//System.out.print(a + ss); 이므로, 14+105을 하면? 정답은 119가 된다.