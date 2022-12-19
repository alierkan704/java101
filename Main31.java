import java.util.Scanner;

public class Main31 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n,i=0,a=0,b=1,c=0;
        System.out.print("Eleman sayısını giriniz:");
        n=inp.nextInt();
        while(i<=n) {
            a = b;
            b = c;
            c = a+b;
            System.out.print(c+" ");
            i++;
        }

    }
}
