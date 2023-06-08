import java.util.Scanner;
public class Game {
    private Scanner inp=new Scanner(System.in);

    public void start() {
        System.out.println("-----Macera Oyuna Hoşgeldiniz-----");
        System.out.println("Lütfen bir isim giriniz:");
        //String playerName=inp.nextLine();
        Player player = new Player("Ali");
        System.out.println("Sayın" + " " + player.getName() + " Bu karanlık ve sisli adaya hoşgeldiniz!");
        System.out.print("Lütfen bir karakter seçiniz:");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println("---------------Bölgeler---------------");
            System.out.println("1-Güvenli Ev");
            System.out.println("2-Mağaza");
            System.out.println("3-Mağara");
            System.out.println("4-Orman");
            System.out.println("5-Nehir");
            System.out.println("6-Maden");
            System.out.println("0-Çıkış");
            System.out.println("Gitmek istediğiniz yeri seçiniz:");
            int selectLoc = inp.nextInt();

            switch (selectLoc) {
                case 0:
                    location = null;
                    break;

                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if(!Cave.isCheckLoc()){
                        location = new Cave(player);
                        break;
                    }else {
                        System.out.println("Bu bölümü oynadınız tekrar giremezsiniz!");
                        continue;
                    }
                case 4:
                    if (!Forest.isCheckLoc()){
                        location = new Forest(player);
                        break;
                    }else {
                        System.out.println("Bu bölümü oynadınız tekrar giremezsiniz!");
                        continue;
                    }
                case 5:
                    if(!River.isCheckLoc()) {
                        location = new River(player);
                        break;
                    }else {
                        System.out.println("Bu bölümü oynadınız tekrar giremezsiniz!");
                        continue;
                    }
                case 6:
                    location=new Coal(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz.");

            }
            if(location==null){
                System.out.println("Oyundan çıkış yaptınız.");
                break;
            }
            if (!location.onLocation())
            {
                System.out.println("Yine bekleriz!");
                break;
            }
        }
    }

}
