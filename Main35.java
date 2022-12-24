import java.util.Scanner;

public class Main35 {
    static int power(int base,int ext){
        if(ext==0) return 1;
        else return base*power(base,(ext-1));
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

       do {
           System.out.print("Taban değeri giriniz:");
           int base = inp.nextInt();
           if(base<0)
               break;
               System.out.print("üs değeri giriniz:");
               int ext = inp.nextInt();

               System.out.println("Sonuç:" + power(base, ext));

       }while(true);
    }
}
