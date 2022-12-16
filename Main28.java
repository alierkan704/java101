import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int toplam=0;
        System.out.print("Bir sayı giriniz:");
        int a=inp.nextInt();
        for(int i=1; i<=a; i++) {
            if(a%i==0) {
                toplam=toplam+i;
            }
        }
        if(toplam==2*a){
            System.out.print("Mükemmel sayıdır!");
        }else{
            System.out.print("Mükemmel sayı değildir!");
        }

    }
}
