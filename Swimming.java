import java.util.Scanner;

public class Swimming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();

        if(inputNum==1||inputNum==3||inputNum==5) {
            System.out.println("enjoy");
        } else {
            System.out.println("oops");
        }
    }
}
