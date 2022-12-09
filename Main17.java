import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a,toplam=0,k=0;
        System.out.print("Bir sayı giriniz:");
        a=inp.nextInt();

        for( int i=1; i<=a; i++) {
            if ((i%3==0)&&(i%4==0)) {
               toplam+=i;
               k++;
               System.out.println(i);
            }
        }
        System.out.print("3 ve 4 e bölünen sayıların ortalaması:"+ toplam/k);
    }
}
