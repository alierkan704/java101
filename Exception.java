import java.util.Scanner;

public class Exception {
    public  static void checkAge(int age) throws java.lang.Exception {
        if(age<18){
            throw new java.lang.Exception("Yaşınız tutmadı");
        }
        System.out.println("Yaşınız uygundur");
    }

    public static void main(String[] args){



        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        int age=inp.nextInt();
        try {
            checkAge(age);
        }catch(java.lang.Exception e){
            System.out.println("Yaşınız uygun değil!");
        }
        System.out.println("Program bitti.");

    }


}