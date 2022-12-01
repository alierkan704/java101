import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.print("üçgenin 1.kenar uzunluğunu giriniz:");
        a=inp.nextInt();
        System.out.print("üçgenin 2.kenar uzunluğunu giriniz:");
        b=inp.nextInt();
        System.out.print("üçgenin 2.kenar uzunluğunu giriniz:");
        c=inp.nextInt();
        int cevre=a+b+c;
        double u=cevre/2.0;
        double alan=Math.sqrt((u*(u-a)*(u-b)*(u-c)));
        System.out.println("üçgenin çevresi:"+cevre);
        System.out.println("üçgenin alanı:"+alan);
    }
}
