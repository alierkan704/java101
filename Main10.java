import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, a,  c , e,  g, k;
        double avarage,b,d,f,h,l;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        turkce = inp.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();
        System.out.print("Müzik notunuzu giriniz:");
        muzik = inp.nextInt();
        if ((mat <= 100) && (mat >= 0)) {
            a = mat;
            b = 1;
        } else {
            a = 0;
        b = 0;
      }
        if ((fizik <= 100) && (fizik >= 0)) {
            c = fizik;
            d = 1;
        } else {
            c = 0;
            d = 0;
        }
        if ((turkce <= 100) && (turkce >= 0)) {
            e = turkce;
            f = 1;
        } else {
            e = 0;
            f = 0;
        }
        if ((kimya <= 100) && (kimya >= 0)) {
            g = kimya;
            h = 1;
        } else {
            g = 0;
            h = 0;
        }
        if ((muzik <= 100) && (muzik >= 0)) {
            k = muzik;
            l = 1;
        } else {
            k = 0;
            l = 0;
        }
        avarage = ((a+c+e+g+k)/(b+d+f+h+l));
        System.out.println("Ortalamanız:"+avarage);

        if (avarage>=55) {
            System.out.print("Tebrikler sınıfı geçtiniz!");

        }else {
            System.out.print("Üzgünüm sınıfta kaldınız!");
        }

    }
}
