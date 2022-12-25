import java.util.Scanner;
public class Main37 {
    static void set(int n,int temp) {
        if(n!=temp) {
            n=n+5;
            System.out.print(n+" ");
            set(n,temp);
        }
    }

    static void des(int n,int temp) {
        if (n > 0) {
            n = n - 5;
            System.out.print(n + " ");
            des(n, temp);
        }
        else {
        set(n, temp);
        }
    }

    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    System.out.print("Bir sayı giriniz:");
    int n=inp.nextInt();
    int temp=n;
    System.out.print(n+",");
       des(n,temp);
    }
}
