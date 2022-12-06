import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        int distance,age,select;
        double tutar,a=0.10;
        Scanner inp = new Scanner(System.in);

        System.out.print("1-Tek Yön\n2-Gidiş Dönüş\nLütfen yolculuk tipinini giriniz:");
        select=inp.nextInt();
        if ((select>0) && (select<3)) {
        System.out.print("Lütfen yaşınızı giriniz:");
        age=inp.nextInt();
        System.out.print("Lütfen mesafeyi km cinsinden giriniz:");
        distance=inp.nextInt();

            switch (select) {
                case 1:
                    if (age < 12) {
                        tutar = (distance * a) - ((distance * a) * 0.5);
                        System.out.print("Toplam tutar:" + tutar);
                    }
                    if ((age >= 12) && (age <= 24)) {
                        tutar = (distance * a) - ((distance * a) * 0.01);
                        System.out.print("Toplam tutar:" + tutar);
                    }
                    if (age > 65) {
                        tutar = (distance * a) - ((distance * a) * 0.3);
                        System.out.print("Toplam tutar:" + tutar);
                    }
                case 2:
                    if (age < 12) {
                        tutar = (distance * a) - ((distance * a) * 0.5);
                        double tutar2=tutar-(tutar*0.2);
                        System.out.print("Gidiş Dönüş toplam tutar:" + tutar2);
                    }
                    if ((age >= 12) && (age <= 24)) {
                        tutar = (distance * a) - ((distance * a) * 0.01);
                        double tutar2=tutar-(tutar*0.2);
                        System.out.print("Gidiş Dönüş toplam tutar:" + tutar2);
                    }
                    if (age > 65) {
                        tutar = (distance * a) - ((distance * a) * 0.3);
                        double tutar2=tutar-(tutar*0.2);
                        System.out.print("Gidiş Dönüş toplam tutar:" + tutar2);
                    }

            }
        }else{
            System.out.print("Hatalı giriş yaptınız!!");
        }

    }
}
