import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    String userName,password;
    int right=3,select;
    int price,balance=5000;

    while(right>0) {
        System.out.print("Kullanıcı adınızı giriniz:");
        userName=inp.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password=inp.nextLine();

        if(userName.equals("Akagami")&&password.equals("java1234")) {
            System.out.println("Merhaba,xyz Bankasına hoşgeldiniz!");
            do { System.out.println("1-Para çekme\n2-Para yatırma\n3-Bakiye sorgulama\n4-Çıkış");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                select=inp.nextInt();
                switch(select) {
                    case 1:
                        System.out.print("Lütfen çekmek istediğiniz tutarı giriniz:");
                        price=inp.nextInt();
                        if(price<5000) {
                            balance=balance-price;
                            System.out.println("İşlem başarılı!");
                        }else{
                            System.out.println("İşlem başarısız.Yetersiz bakiye! ");
                        }
                        break;
                    case 2:
                        System.out.print("Lütfen yatırmak istediğiniz tutarı giriniz:");
                        price=inp.nextInt();
                        balance=balance+price;
                        System.out.println("İşlem başarılı!");
                        break;
                    case 3:
                        System.out.println("Bakiyeniz:"+balance);
                        break;

                }

            } while(select!=4);
            System.out.println("Tekrar görüşmek üzere!");
            break;

        }else {
            --right;
            System.out.println("Kullanıcı adı veya şifre yanlış.Lütfen tekrar deneyiniz!:");
        }
        System.out.println("Kalan hakkınız:"+right);
        if(right==0) {
            System.out.print("Hesabınız bloke olmuştur.Lütfen banka ile iletişme geçiniz!");
        }
    }
    }
}
