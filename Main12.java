import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp=new Scanner(System.in);

        System.out.print("a sayısını giriniz:");
        a=inp.nextInt();
        System.out.print("b sayısını giriniz:");
        b=inp.nextInt();
        System.out.print("c sayısını giriniz:");
        c=inp.nextInt();

        if ((a<b) && (a<c)) {
            if (b<c){
                System.out.print("a<b<c");
            }else{
                System.out.print("a<c<b");
            }
        }
        if ((b<a) && (b<c)) {
            if (a<c){
                System.out.print("b<a<c");
            }else{
                System.out.print("b<c<a");
            }
        }
        if ((c<a) && (c<b)) {
            if (a<b){
                System.out.print("c<a<b");
            }else{
                System.out.print("c<b<a");
            }
        }

    }
}
