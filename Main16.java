import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        int a, year;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen yıl giriniz:");
        year = inp.nextInt();

        if (year > 0) {
            a = (year % 100);
            if (a == 0) {
                if ((year % 400) == 0) {
                    System.out.print(year + ":Bir artık yıldır!");
                } else {
                    System.out.print(year + ":Bir artık yıl değildir!");
                }
            }
            else {
                if ((year%4)==0) {
                    System.out.print(year +":Bir artık yıldır!");
                }else {
                    System.out.print(year +":Bir artık yıl değildir!");
                }
            }
        }else{
            System.out.print("Hatalı giriş yaptınız!");
        }
    }
}