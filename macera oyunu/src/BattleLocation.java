import java.util.Locale;
import java.util.Random;

public abstract class BattleLocation extends Location {
    private  Obstacle obstacle;
    private   String award;

    private  boolean isLoc;
    private  int maxObstacle;

    private int obsNumber;

    public BattleLocation(Player player, String name,Obstacle obstacle,String award,int maxObstacle) {
        super(player,name);
        this.obstacle=obstacle;
        this.award=award;
        this.maxObstacle=maxObstacle;
        this.obsNumber=obsNumber;


    }

    @Override
    public boolean onLocation() {

            obsNumber = this.randomObstacleNumber();
            System.out.println("Şuan buradasın:" + this.getName());
            System.out.println("Dikkatli ol burada" + " " + obsNumber + " tane" + " " + this.getObstacle().getName() + " yaşıyor");
            System.out.println(obsNumber + " tane" + " " + this.getObstacle().getName() + " ile karşılaştın!");
            System.out.println("<S>avaş yada <K>aç");
            String selectMode = inp.nextLine();
            selectMode = selectMode.toUpperCase();
            if (selectMode.equals("S") && combat(obsNumber)) {
                System.out.println(this.getName() + " Bölgesindeki tüm düşmanları yendiniz!");
                this.getPlayer().getInventory().setAwards(this.getPlayer().getInventory().getAwards() + this.getAward());
                System.out.println(this.getPlayer().getInventory().getAwards());
                switch (this.getName()) {
                    case "Orman":
                        Forest.setCheckLoc(true);
                        break;
                    case "Nehir":
                        River.setCheckLoc(true);
                        break;
                    case "Mağara":
                        Cave.setCheckLoc(true);
                        break;
                }

                if (!this.getObstacle().getName().equals("Yılan")){
                    this.getPlayer().getInventory().setAwardNumber(this.getPlayer().getInventory().getAwardNumber()+1);
                    System.out.println("Kazanılan ödül sayısı:"+this.getPlayer().getInventory().getAwardNumber());
                    if (this.getPlayer().getInventory().getAwardNumber() == 3){
                        System.out.println();
                        System.out.println("Bütün Ödülleri Toplayarak Oyunu KAZANDINIZ !!!!");
                        return false;
                    }
                    return true;

                }else {
                    int giftId = randomGiftID();
                    System.out.println("İtem düşme şans sayısı 7 den küçükse item kazanırsınız:)");
                    System.out.println("İtem düşme şans sayısı:"+randomGiftLuck());
                    if (randomGiftLuck() < 5){

                        if (randomItemsID() < 50) {
                            if (giftId != 0) {
                                Weapon selectedWeapon = Weapon.getWeaponObjById(giftId);
                                if (selectedWeapon != null) {
                                    System.out.println(selectedWeapon.getName() + " Silahını kazandınız :)");
                                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                                }
                            }
                        } else {
                            if (giftId != 0) {
                                Armor selectedArmor = Armor.getArmorObjById(giftId);
                                if (selectedArmor != null) {
                                    System.out.println(selectedArmor.getName() + " Zrıh kazandınız :)");
                                    this.getPlayer().getInventory().setArmor(selectedArmor);
                                }
                            }
                        }
                }else{
                    System.out.println("Üzgünüm hiç item kazanamadınız:(");
                    }
                }

                return true;
            }
            if (this.getPlayer().getHealth() <= 0) {
                System.out.println("Öldünüz :(");
                return false;
            }
        return true;

    }


    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++){
            this.getObstacle().setHealth(this.getObstacle().getOrjHealth());
            playerState();
            obstacleState(i);
            System.out.println("-------------------------------");
        while(this.getPlayer().getHealth()>0&&this.getObstacle().getHealth()>0) {
            int x = randomStart();
            if (x == 0) {
                if (this.getObstacle().getHealth() > 0) {
                    System.out.println();
                    int obsDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                    if (obsDamage < 0) {
                        obsDamage = 0;
                    }
                    System.out.println(this.getObstacle().getName() + " size" + " " + obsDamage + " hasar verdi");
                    this.getPlayer().setHealth(this.getPlayer().getHealth() - obsDamage);
                    afterHit();
                }

                System.out.println("<V>ur yada <K>aç");
                String chose = inp.nextLine().toUpperCase();
                if (chose.equals("V")) {
                    System.out.println("Siz" + " " + this.getPlayer().getTotalDamage() + " hasar verdiniz");
                    obstacle.setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                } else {
                    return false;
                }


            }
            if (x == 1) {
                System.out.println("<V>ur yada <K>aç");
                String chose = inp.nextLine().toUpperCase();
                if (chose.equals("V")) {
                    System.out.println("Siz" + " " + this.getPlayer().getTotalDamage() + " hasar verdiniz");
                    obstacle.setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();

                    if (this.getObstacle().getHealth() > 0) {
                        System.out.println();
                        int obsDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obsDamage < 0) {
                            obsDamage = 0;
                        }
                        System.out.println(this.getObstacle().getName() + " size" + " " + obsDamage + " hasar verdi");
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obsDamage);
                        afterHit();
                    }
                } else {
                    return false;
                }
            }
        }
             /*  System.out.println("<V>ur yada <K>aç");
               String chose = inp.nextLine().toUpperCase();
               if (chose.equals("V")) {
                   System.out.println("Siz" + " " + this.getPlayer().getTotalDamage() + " hasar verdiniz");
                   obstacle.setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                   afterHit();

                   if (this.getObstacle().getHealth() > 0) {
                       System.out.println();
                       int obsDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                       if (obsDamage < 0) {
                           obsDamage = 0;
                       }
                       System.out.println(this.getObstacle().getName() + " size" + " " + obsDamage + " hasar verdi");
                       this.getPlayer().setHealth(this.getPlayer().getHealth() - obsDamage);
                       afterHit();
                   }
               } else {
                   return false;
               }*/

        if(this.getPlayer().getHealth()>this.getObstacle().getHealth()){
            System.out.println("Düşmanı yendiniz!");
            System.out.println("-------------------------------");
            System.out.println(this.getObstacle().getGold()+" tane altın kazandınız");
            this.getPlayer().setGold(this.getPlayer().getGold()+this.getObstacle().getGold());
            System.out.println("Yeni bakiyeniz:"+this.getPlayer().getGold());
        }else {
            return false;
          }
        }
            return  true;
    }

    public void afterHit(){
        System.out.println("Canınız:"+this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName()+" Canı:"+this.getObstacle().getHealth());
    }
    public void playerState(){
        System.out.println("Oyuncu Değerleri");
        System.out.println("-------------------------------");
        System.out.println("Sağlığınız:"+this.getPlayer().getHealth());
        System.out.println("Silahınız:"+this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasarınız:"+this.getPlayer().getTotalDamage());
        System.out.println("Zırhınız:"+this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklamanız:"+this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Altınınız:"+this.getPlayer().getGold());
        System.out.println("-------------------------------");
    }
    public void obstacleState(int i){
        System.out.println(i+"."+this.getObstacle().getName()+" Değerleri");
        System.out.println("Sağlığı:"+this.getObstacle().getHealth());
        System.out.println("Hasarı:"+this.getObstacle().getDamage());
        System.out.println("Altını:"+this.getObstacle().getGold());
    }


    public int randomGiftLuck(){
        Random r=new Random();
        return r.nextInt(10)+1;
    }


    public int randomItemsID(){
        Random r=new Random();
        return r.nextInt(100)+1;
    }

    public int randomGiftID(){
        Random r=new Random();
        return r.nextInt(3)+1;
    }


    public int randomStart(){
        Random r=new Random();
        return r.nextInt(2);
    }

    public int randomObstacleNumber(){
        Random r=new Random();
        return r.nextInt(this.getMaxObstacle())+1;
    }


    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public void setAward(String award) {
        this.award = award;

    }

    public int getObsNumber() {
        return obsNumber;
    }

    public void setObsNumber(int obsNumber) {
        this.obsNumber = obsNumber;
    }

    public boolean isLoc() {
        return isLoc;
    }

    public void setLoc(boolean loc) {
        isLoc = loc;
    }
}

