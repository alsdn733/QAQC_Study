import java.util.Scanner;

public class Seq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1<num2) {
            for(int i = num1; i<=num2; i++) {
                if(i==num2){
                    System.out.println(i);
                } else {
                    System.out.print(i+" ");
                }
            }
        } else {
            for(int i = num2; i<=num1; i++) {
                if(i==num1){
                    System.out.println(i);
                } else {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
