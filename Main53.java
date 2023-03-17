import java.util.Scanner;

public class Main53 {
    static void recursiveMethod(int number){
        if(number>7) {
            if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
                System.out.println("Girilen sayı asal sayı değildir.");
            }else{
                System.out.println("Girilen sayı asal sayıdır");
            }
        }else{
            if(number==2||number==3||number==5||number==7){
                System.out.println("Girilen sayı asal sayıdır");
            }else{
                System.out.println("Girilen sayı asal sayı değildir.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number=inp.nextInt();
        recursiveMethod(number);

    }
}
