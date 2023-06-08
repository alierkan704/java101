public class ToolStore extends NormalLocation{
    public ToolStore(Player player){

        super(player,"Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("-------Mağazaya Hoşgeldiniz-------");
        System.out.println("1-Silahlar");
        System.out.println("2-Zırhlar");
        System.out.println("3-Çıkış Yap");
        System.out.print("Seçiminiz:");
        int selectCase=inp.nextInt();
        if(selectCase<1||selectCase>3){
            System.out.println("Geçersiz değer,Yeniden Giriniz:");
            selectCase=inp.nextInt();
        }else {
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                   System.out.print("Bir daha bekleriz");
                   return true;
            }
        }
        return true;
    }




    public void printWeapon(){
        System.out.println("Silahlar");
        for(Weapon w:Weapon.weapons()) {
            System.out.println(w.getId() + " " + w.getName() + " " + "Hasar:" + w.getDamage() + " " + "Para:" + w.getPrice());
        }
        System.out.println("0-Çıkış Yap");
    }
    public void buyWeapon() {
        System.out.print("Bir silah seçiniz:");
        int selectWeaponId = inp.nextInt();
        while (selectWeaponId < 0 || selectWeaponId > Weapon.weapons().length) {
            System.out.println("Geçersiz değer,Yeniden Giriniz:");
            selectWeaponId = inp.nextInt();
        }
        if(selectWeaponId!=0){
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponId);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getGold()) {
                    System.out.println("Yetersiz bakiye");
                } else {
                    System.out.println(selectedWeapon.getName() + " Silahını satın aldınız");
                    int balance = this.getPlayer().getGold() - selectedWeapon.getPrice();
                    this.getPlayer().setGold(balance);
                    System.out.println("Kalan Altın:" + this.getPlayer().getGold());
                    // System.out.println("Önceki silahınız:"+this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    //  System.out.println("Yeni silahınız:"+this.getPlayer().getInventory().getWeapon().getName());

                }
            }
        }

    }
    public void printArmor() {
        System.out.println("Zırhlar");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + " " + a.getName() + " " + "Hasar:" + a.getBlock() + " " + "Para:" + a.getPrice());
        }

    }
    private void buyArmor() {
        System.out.print("Bir zırh seçiniz:");
        int selectArmorId = inp.nextInt();
        while (selectArmorId < 0 || selectArmorId > Armor.armors().length) {
            System.out.println("Geçersiz değer,Yeniden Giriniz:");
            selectArmorId = inp.nextInt();
        }
        if(selectArmorId!=0){
            Armor selectedArmor = Armor.getArmorObjById(selectArmorId);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getGold()) {
                    System.out.println("Yetersiz bakiye");
                } else {
                    System.out.println(selectedArmor.getName() + " Zrıh satın aldınız");
                    int balance = this.getPlayer().getGold() - selectedArmor.getPrice();
                    this.getPlayer().setGold(balance);
                    System.out.println("Kalan Altın:" + this.getPlayer().getGold());
                    this.getPlayer().getInventory().setArmor(selectedArmor);


                }
            }
        }

    }

}
