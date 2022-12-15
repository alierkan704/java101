import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, a,maks=0,min=0;
        System.out.print("Kaç tane sayı gireceksiniz:");
        n = inp.nextInt();
        for(int i=1; n-i>=0; i++){
            System.out.print("Sayınızı giriniz:");
            a = inp.nextInt();
            if (i==1)
            {
                maks=a;
                min=a;
            }

            if (a>maks) {
                maks = a;
            }

            if (a<min) {
                min = a;
            }
        }
        System.out.println("En büyük sayı:"+maks);
        System.out.print("En küçük sayı:"+min);
    }
}
