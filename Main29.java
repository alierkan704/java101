import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n;
        System.out.print("Basamak sayısını giriniz:");
        n=inp.nextInt();
        for (int i=n-1; i>=1; i--){
            for (int k=n; k>i; k--){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
