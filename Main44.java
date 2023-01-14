import java.util.Scanner;
import java.util.Arrays;
public class Main44 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int a=inp.nextInt();

        int[]list={1,74,-32,15,24,48};
        int min=0;
        int max=0;
        Arrays.sort(list);
        for (int i=0; i<list.length; i++){
            if(a<list[i]){
                max=list[i];
                break;
            }
        }
        for (int i=list.length-1;i>=0;i--) {
            if (a > list[i]) {
                min = list[i];
                break;
            }

        }
        System.out.print("Girilen sayı:"+a+"\n");
        System.out.print("Girilen sayıdan büyük en yakın sayı:"+max+"\n");
        System.out.print("Girilen sayıdan küçük en yakın sayı:"+min);
    }
}
