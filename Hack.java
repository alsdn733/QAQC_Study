import java.util.Scanner;

public class Hack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int e = sc.nextInt();
        int c = sc.nextInt();
        int diff = e - c;

        if(r<diff) {
            System.out.println("advertise");
        } else if (r>diff) {
            System.out.println("do not advertise");
        } else {
            System.out.println("does not matter");
        }
    }
}
