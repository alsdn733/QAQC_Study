import java.util.ArrayList;
import java.util.Scanner;

public class Coci_note {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (arrayList.size() < 8) {
            arrayList.add(sc.nextInt());
        }
        boolean ascending = false;
        for(int i=0; i<arrayList.size()-1; i++) {
            if(arrayList.get(i+1)-arrayList.get(i)==1){
                ascending = true;
                if(i==arrayList.size()-2) {
                    System.out.println("ascending");
                    break;
                }
                continue;
            } else if(arrayList.get(i+1)-arrayList.get(i)==-1&&ascending==false){
                if(i==arrayList.size()-2) {
                    System.out.println("descending");
                    break;
                }
                continue;
            } else {
                System.out.println("mixed");
                break;
            }
        }
    }
}