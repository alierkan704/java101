import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    int n;
    System.out.print("n sayısını giriniz:");
    n=inp.nextInt();
    double i=1.0,result=0;
    while (i<=n) {
        result=result+(1/i);
        System.out.println(1/i);
        i++;
    }
System.out.print("Harmonik seri:"+result);
    }
}
