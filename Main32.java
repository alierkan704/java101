import java.util.Scanner;

public class Main32 {
    static boolean isPalindrom(int number) {
        int temp = number;
        int reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp / 10;
        }
        if (reverseNumber == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayınızı giriniz:");
        int n = inp.nextInt();
        if (isPalindrom(n) == true) {
            System.out.print("Girilen sayı Palindromdur!");
        } else {
            if (isPalindrom(n) == false) {
                System.out.print("Girilen sayı Palindrom değildir!");
            }
        }
    }
}

