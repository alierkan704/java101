import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        double boy;
        int kilo;
        Scanner inp= new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz:");
        boy=inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo=inp.nextInt();
        double sonuc=kilo/Math.pow(boy,2);
        System.out.print("Vücut kitle indeksiniz:"+sonuc);

    }
}
