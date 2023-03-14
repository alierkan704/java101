import java.util.Arrays;
import java.util.Scanner;


public class Main50 {
    public static void main(String[] args) {
    boolean isWin=false;
    int number= (int) (Math.random()*100);
    Scanner inp= new Scanner(System.in);
    System.out.println(number);
    for(int right=1; right<=5; right++){
        System.out.println("1 ile 100 arasında bir sayı giriniz:");
        int guess=inp.nextInt();
        if(guess==number){
            isWin=true;
            break;
        }else{
            System.out.println("Tahmin ettiğiniz sayı yanlış!");
            System.out.println("Kalan hakkınız:"+(5-right));
            if(guess<number){
                System.out.println("Tahmin ettiğiniz sayı gizli sayıdan küçüktür!");
            }else{
                System.out.println("Tahmin ettiğiniz sayı gizli sayıdan büyüktür!");
            }
        }
       }
        if(isWin==true){
            System.out.println("Tebrikler tahmin ettiğiniz sayı doğru!");
        }else {
            System.out.println("Kaybettiniz!");
            System.out.println("Gizli sayı:" + number);
        }
    }
}
