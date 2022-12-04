import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        int a,b,c,d,e;
        double armutFiyati=3.5,elmaFiyati=7.5,domatesFiyati=4,muzFiyati=6.25,patlicanFiyati=5.4;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo:");
         a = inp.nextInt();
        System.out.print("Elma kaç kilo:");
         b = inp.nextInt();
        System.out.print("Domates kaç kilo:");
         c = inp.nextInt();
        System.out.print("Muz kaç kilo:");
         d= inp.nextInt();
        System.out.print("Patlıcan kaç kilo:");
         e= inp.nextInt();

         double tutar1= a>0? armutFiyati*a:0;
         double tutar2= b>0? elmaFiyati*b:0;
         double tutar3= c>0? domatesFiyati*c:0;
         double tutar4= d>0? muzFiyati*d:0;
         double tutar5= e>0? patlicanFiyati*e:0;
         double toplamTutar=tutar1+tutar2+tutar3+tutar4+tutar5;
         System.out.print("Toplam borcunuz:"+toplamTutar);
    }
}
