public class Forest extends  BattleLocation{
    private static boolean checkLoc=false;
    public Forest(Player player) {
        super(player,"Orman",new Vampire(),"Firewood,",3);
    }

    public static boolean isCheckLoc() {
        return checkLoc;
    }

    public static void setCheckLoc(boolean checkLoc) {
        Forest.checkLoc = checkLoc;
    }
}
