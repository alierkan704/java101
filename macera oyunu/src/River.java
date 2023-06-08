public class River extends  BattleLocation{
    private static boolean checkLoc=false;
    public River(Player player) {
        super(player,"Nehir",new Bear(),"Water,",3);
    }

    public static boolean isCheckLoc() {
        return checkLoc;
    }

    public static void setCheckLoc(boolean checkLoc) {
        River.checkLoc = checkLoc;
    }
}
