import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,ebob=1,ekok=0;
        System.out.print("Birinci sayıyı giriniz:");
        a=inp.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        b=inp.nextInt();
        if( a < b ) {
            int i=1;
            while(i<=a) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                    ekok = (a * b) / ebob;
                }
                i++;
            }
        }
        else{ int i=1;
            while(i<=b) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                    ekok = (a * b) / ebob;
                }
                i++;
            }
            System.out.println("a ve b sayısının ebobu:"+ebob);
            System.out.println("a ve b sayısının ekoku:"+ekok);
        }

    }
}

