public class Cave extends BattleLocation{
    private static boolean checkLoc=false;

    public Cave(Player player) {
        super(player,"Mağara",new Zombie(),"Food,",3);
    }

    public static boolean isCheckLoc() {
        return checkLoc;
    }

    public static void setCheckLoc(boolean checkLoc) {
        Cave.checkLoc = checkLoc;
    }
}
