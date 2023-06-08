import java.util.Scanner;
public class Player {

    private int id;
    private int damage;
    private int health;
    private int orjhealth;
    private int gold;
    private String name;
    private String charName;
    private Scanner inp=new Scanner(System.in);
    private Inventory inventory;
    private int totalDamage;
    public Player(String name)
    {
        this.name=name;
        this.inventory=new Inventory();
        }
    public void selectChar(){
    Archer archer=new Archer();
    Samurai samurai=new Samurai();
    Knight knight=new Knight();

    GameChar[] charList= {new Samurai(),new Archer(),new Knight()};
        System.out.println("------------------KARAKTERLER-------------------");
        System.out.println("------------------------------------------------");
    for(GameChar gameChar: charList){
        System.out.println("id:"+gameChar.getId()+"  Karakter:"+gameChar.getName()+"  Hasar:"+gameChar.getDamage()+"  Sağlık:"+gameChar.getHealth()+"  Altın:"+gameChar.getGold());
    }
        System.out.println("------------------------------------------------");
        System.out.println("Lütfen bir karakter seçiniz:");
        int selectChar=inp.nextInt();

        switch (selectChar){
                case 1:
                    initPlayer(new Samurai());
                    break;
                case 2:
                    initPlayer(new Archer());
                    break;
                case 3:
                    initPlayer(new Knight());
                    break;
            default:
                initPlayer(new Archer());
            }
    }
    public void initPlayer(GameChar gameChar){
        this.setId(gameChar.getId());
        this.setName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOrjhealth(gameChar.getHealth());
        this.setGold(gameChar.getGold());
    }
    public void printInfo(){
        System.out.println("Kahramanınız:"+this.getName()+" Silahınız:"+this.getInventory().getWeapon().getName()+"  Hasar:"+this.getTotalDamage()+
                "  Zırhınız:"+getInventory().getArmor().getName()+"  Bloklama:"+getInventory().getArmor().getBlock()+"  Sağlık:"+this.getHealth()+
                "  Altın:"+this.getGold());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {

        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<0){
           health=0;
        }
        this.health = health;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getTotalDamage() {
        return damage+this.getInventory().getWeapon().getDamage();
    }

    public void setTotalDamage(int totalDamage) {
        this.totalDamage = totalDamage;
    }

    public int getOrjhealth() {
        return orjhealth;
    }

    public void setOrjhealth(int orjhealth) {
        this.orjhealth = orjhealth;
    }
}
