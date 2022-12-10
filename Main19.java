import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int k;
        System.out.print("Bir sayı giriniz:");
        k=inp.nextInt();
        for(int i=1; i<=k; i*=4){
            System.out.println("4 ün kuvvetleri:"+i);
        }
        for(int a=1; a<=k; a*=5) {
            System.out.println("5 in kuvvetleri:" + a);
        }
    }
}
