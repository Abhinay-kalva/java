import java.util.Scanner;
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }
        
        Arrays.sort(a);
        
       int []b=new int[5];
        for (int i = 0; i < 5; i++) {
            b[i]=a[i];
        }
        for(int i=0;i<5;i++){
            System.out.println(b[i]);
        }
        scanner.close();
    }
}
