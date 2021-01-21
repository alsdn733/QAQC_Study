import java.util.Scanner;

public class Comparefrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int discriminant = a*d - b*c;

        if(discriminant>0) {
            System.out.println("1");
        } else if (discriminant<0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }

    }
}
