import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, muzik, kimya, fizik, tarih, turkce;
        int ortalama = 60;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen matematik notunuzu giriniz:");
        mat = inp.nextInt();
        System.out.println("Lütfen fizik notunuzu giriniz:");
        fizik = inp.nextInt();
        System.out.println("Lütfen kimya notunuzu giriniz:");
        kimya = inp.nextInt();
        System.out.println("Lütfen tarih notunuzu giriniz:");
        tarih = inp.nextInt();
        System.out.println("Lütfen türkçe notunuzu giriniz:");
        turkce = inp.nextInt();
        System.out.println("Lütfen müzik notunuzu giriniz:");
        muzik = inp.nextInt();
        double sonuc = (kimya+fizik+mat+tarih+muzik+turkce)/6.0;
        System.out.println("Ortalamanız :"+sonuc);
        boolean karsilastirma = sonuc > ortalama ;
        String str = karsilastirma ? "Tebrikler,Sınıfı Geçtiniz." : "Üzgünüz, Sınıfta Kaldınız.";
        System.out.print(str);


    }
}
