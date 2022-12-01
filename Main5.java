import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        int r,a;
        double pi=3.14;
        Scanner inp= new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz:");
        r=inp.nextInt();
        System.out.print("Merkez açınızı giriniz:");
        a=inp.nextInt();
        double alan=(pi*Math.pow(r,2)*a)/360;
        System.out.print("Daire diliminin alanı:"+alan);
    }
}
