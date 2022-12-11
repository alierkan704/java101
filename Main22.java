import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    int a,b,c=0,k=0;
    System.out.print("Bir sayı giriniz:");
    a=inp.nextInt();
    while(a!=0) {
        b=a%10;
        a=a/10;
        c=b+c;
        k++;
    }
    System.out.println("Girilen sayının basamak sayısı:"+k);
    System.out.print("Girilen sayının basamak sayılarının toplamı:"+c);

    }
}
