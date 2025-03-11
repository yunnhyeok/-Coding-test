import java.util.*;
public class StepTwo {
    public static void main(String args[]) {
        Scanner ab = new Scanner(System.in);
        try {
            int a = ab.nextInt();
            int b = ab.nextInt();
            System.out.println(a + b);
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력하세요.");
        }
        ab.close(); // System.in을 닫지 않음
    }
}