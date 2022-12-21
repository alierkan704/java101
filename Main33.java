import java.util.Scanner;

public class Main33 {
    static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz:");
        int k=inp.nextInt();
        for(int n=1; n<=k; n++) {
            System.out.print(fib(n)+" ");
        }

    }
}