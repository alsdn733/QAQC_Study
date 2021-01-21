import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = 0;

        num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println(num1+" "+num2);

//      System.out.println(num2+" "+num1);  // swap안하고 그냥 이렇게 출력하면 사실 답임...



    }
}
