import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
     Scanner inp=new Scanner(System.in);
     int a,b;
     System.out.print("üssü alınacak sayıyı giriniz:");
     a=inp.nextInt();
     System.out.print("üs olacak sayıyı giriniz:");
     b=inp.nextInt();

     int total=1;
     for(int i=1; i<=b; i++) {
         total=total*a;
     }
        System.out.print("cevap:"+total);
    }
}
