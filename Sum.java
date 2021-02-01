import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        for(int i=1; i<=7; i++) {
            num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
