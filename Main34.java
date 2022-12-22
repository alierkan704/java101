import java.util.Scanner;

public class Main34 {
    static void plus() {
        Scanner inp = new Scanner(System.in);
        int number, result = 0, i = 1;
        System.out.println("Toplanacak sayıları giriniz!");
        while (true) {
            System.out.print(i++ + ".sayıyı giriniz:");
            number = inp.nextInt();
            if (number == 0) {
                break;
            }
                result += number;
        }
        System.out.println("Sonuç:"+result);
    }

    static void minus() {
        Scanner inp = new Scanner(System.in);
        int number, result = 0,n,i=1;
        System.out.print("Kaç adet sayı gireceksiniz:");
        n=inp.nextInt();
        while(i<=n) {
            System.out.print(i + ".sayıyı giriniz:");
            number=inp.nextInt();
            if(i==1) {
                result+=number;
                i++;
            }else {
                result = result - number;
                i++;
            }

        }
        System.out.println("Sonuç:"+result);
    }

    static void times() {
        Scanner inp = new Scanner(System.in);
        int number,result=1,n,i=1;
        System.out.print("Kaç adet sayı gireceksiniz:");
        n=inp.nextInt();
        while(i<=n) {
            System.out.print(i + ".sayıyı giriniz:");
            number=inp.nextInt();
            result=result*number;
            i++;
        }
        System.out.println("Sonuç:"+result);
    }

    static void divided() {
        Scanner inp = new Scanner(System.in);
        int number,n,i=1;
        double result=0.0;
        System.out.print("Kaç adet sayı gireceksiniz:");
        n=inp.nextInt();
        while(i<=n) {
            System.out.print(i + ".sayıyı giriniz:");
            number=inp.nextInt();
            if(i!=1 && number==0){
                System.out.println( "Bölen 0 olamaz.!!");
                continue;
            }
            if(i==1){
                result=number;
                i++;
            }else {
                result /= number;
                i++;
            }

        }
        System.out.println("Sonuç:"+result);
    }

    static void power() {
        Scanner inp = new Scanner(System.in);
        int number1,number2;
        int result=1;
        System.out.print( "üs alınacak sayıyı giriniz:");
        number1=inp.nextInt();
        System.out.print( "üs olacak sayıyı giriniz:");
        number2=inp.nextInt();
        for(int i=1; i<=number2; i++ ) {
            result*=number1;
        }
        System.out.println("Sonuç:"+result);
    }

        static void factorial() {
            Scanner inp = new Scanner(System.in);
            int number,result=1;
            System.out.print( "Bir sayı giriniz:");
            number=inp.nextInt();
            for(int i=0; i<number; i++) {
                result*=number-i;

            }
            System.out.println("Sonuç:"+result);

        }

    static void combination() {
        Scanner inp = new Scanner(System.in);
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

    static void mod() {
        Scanner inp = new Scanner(System.in);
        int number1,number2;
        double result=0;
        System.out.print("1. sayıyı giriniz:");
        number1=inp.nextInt();
        System.out.print("2. sayıyı giriniz:");
        number2=inp.nextInt();
        result=number1%number2;
        System.out.println("Sonuç:"+result);
    }

    static void geo() {
        Scanner inp = new Scanner(System.in);
        int a,b;
        int alan=1,cevre=1;
        System.out.print("Uzun kenarı giriniz:");
        a=inp.nextInt();
        System.out.print("Kısa kenarı giriniz:");
        b=inp.nextInt();
        alan=a*b;
        cevre=2*(a+b);
        System.out.println("Dikdörtgenin alanı:"+alan);
        System.out.println("Dikdörtgenin çevresi:"+cevre);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1-Toplama işlemi\n"
                + "2-Çıkarma işlemi\n"
                + "3-Çarpma işlemi\n"
                + "4-Bölme işlemi\n"
                + "5-Üslü sayılar hesaplama\n"
                + "6-Faktoriyel hesaplama\n"
                + "7-Kombinasyon hesaplama\n"
                + "8-Mod alma\n"
                + "9-Diktörtgen alan ve çevre hesabı\n"
                + "0-Çıkış yapmak";

      do {
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemi seçiniz:");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    combination();
                    break;
                case 8:
                    mod();
                    break;
                case 9:
                    geo();
                    break;
                case 0:
                    System.out.print("Güle güle!");
                    break;
                    default:

            }
        }while(select!=0);
    }
}

