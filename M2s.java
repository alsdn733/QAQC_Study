import java.util.Scanner;

public class M2s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minuetes = scanner.nextInt();
        int seconds = minuetes * 60;

        System.out.println(minuetes + " minuetes is " + seconds + " seconds.");
    }
}
