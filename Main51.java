import java.util.Scanner;

public class Main51 {
    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        if(str.charAt(i)==str.charAt(j)){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String str;
        System.out.println("Kelime giriniz:");
        str=inp.nextLine();
        System.out.println(isPalindrome(str));
        if(isPalindrome(str)==true){
            System.out.println("Girilen kelime Palindromdur!");
        }else{
            System.out.println("Girilen kelime Palindrom değildir!");
        }


    }
}
