import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,total=0;
       do{
        System.out.print("Sayı giriniz:");
        a=inp.nextInt();
        if(a%4==0) {
            total += a;
        }

        }while (a%2==0);
        System.out.print("4 ün katı girilen çift sayıların toplamı:"+total);
    }
}















