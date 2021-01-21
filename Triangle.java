import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();
        double area = (double)(width * height)/2;

        System.out.println(String.format("%.2f", Math.round(area*100)/100.0));
    }
}
