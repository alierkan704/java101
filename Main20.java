import java.util.Scanner;
public class Main20 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int n,r;
        System.out.print("n sayısını giriniz:");
        n=inp.nextInt();
        System.out.print("r sayısını giriniz:");
        r=inp.nextInt();
        int a=1;
        for(int i=1; i<=n; i++) {
            a=a*i;
        }
        System.out.println("n!:"+a);

        int b = 1;
        for(int l=1; l<=r; l++) {

            b = b * l;
        }
        System.out.println("r!:"+b);

        int c  = 1;
        for(int k=1; k<=n-r; k++) {

            c = c * k;
        }
        System.out.println("(n-r)!:"+c);
        int sonuc=a/(b*c);
        System.out.println("C(n,r)!:"+sonuc);
    }
}
