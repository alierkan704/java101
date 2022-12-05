import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        String userName,password,passwordNew;
        int select;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz:");
        userName = inp.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java12345") ){
            System.out.print("Giriş yaptınız !");
        }else {
            System.out.println("Hatalı giriş yaptınız !");
            System.out.println("1-Yeniden deneyin\n2-Şifremi unuttum");
            System.out.print("Bir işlem seçiniz:");
            select = inp.nextInt();
            if (select==1) {
                    System.out.print("Kullanıcı adını giriniz:");
                    inp.nextLine();
                    userName= inp.nextLine();

                    if (userName.equals("patika")) {
                        System.out.print("Şifrenizi giriniz:");
                       password= inp.nextLine();
                    if (password.equals("java12345"))
                        System.out.print("Giriş yaptınız !");}
                     }

            if (select==2) {
                    System.out.print("Yeni şifrenizi giriniz: ");
                    inp.nextLine();
                    passwordNew=inp.nextLine();
                    if (passwordNew.equals("java12345")) {
                        System.out.print("Yeni şifreniz daha önceki şifreniz ile aynı olamaz!");
                    }else{
                        System.out.print("Yeni şifre oluşturuldu.");

                    }

            }
        }

       }

    }

