import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        n2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Bir işlem seçiniz:");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam:"+(n1+n2));
                break;
            case 2:
                System.out.print("Çıkarma:"+(n1-n2));
                break;
            case 3:
                System.out.print("Çarpma:"+(n1*n2));
                break;
            case 4:
                if(n2!=0) {
                    System.out.print("Bölme:" + (n1 / n2));
                }else
                    System.out.print("Bölme işleminde payda 0 olamaz!\nTekrar deneyiniz");
                break;
            default:
                System.out.print("Hatalı giriş yaptınız.Tekrar deneyiniz");


        }

    }
}
