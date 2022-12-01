import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
double fiyat;
Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen ürün fiyatını giriniz:");
        fiyat = inp.nextDouble();
        double kdvOrani1=0.18;
        double kdvOrani2=0.08;
        double kdv1 = fiyat*kdvOrani1;
        double kdv2 = fiyat*kdvOrani2;
        double kdvTutari = (fiyat >= 0 && fiyat <= 1000) ? kdv1 : kdv2;
        double sonuc=kdvTutari + fiyat;
        double kdvOrani = (fiyat >= 0 && fiyat <= 1000) ? kdvOrani1 : kdvOrani2;
        System.out.println("Kdv oranınız :"+kdvOrani);
        System.out.println("Kdv fiyatınız :"+kdvTutari);
        System.out.println("Kdv li toplam fiyatınız :"+sonuc);

    }
}
