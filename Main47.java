import java.util.Arrays;
import java.util.Scanner;


public class Main47 {
    public static void main(String[] args) {
        int n,a;
        Scanner inp=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz:");
        n=inp.nextInt();
        int[] list= new int[n];
        int startIndex=0;
        for(int i=0; i<n; i++){
            System.out.print((i+1)+".elamanı giriniz:");
            a=inp.nextInt();
                    list[i]=a;
                }
        Arrays.sort(list);
        System.out.print(Arrays.toString(list));
    }
}