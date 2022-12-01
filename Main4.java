import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        double km;
        Scanner inp = new Scanner(System.in);
        System.out.print("Gidilen KM'yi giriniz:");
        km=inp.nextFloat();
        int baslangic=10;
        double sonuc=(km*2.20)+baslangic;
        double tutar= sonuc<20? 20:sonuc;
        System.out.print("Toplam taksimetre tutarınız:"+tutar);
    }
}
