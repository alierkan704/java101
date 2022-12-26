public class Main {
    public static void main(String[] args) {
        Fighter ali = new Fighter("Muhammed Ali" , 35 , 100, 95, 45);
        Fighter tyson = new Fighter("M.Tyson" , 25 , 110, 100, 55);
        Ring r = new Ring(ali,tyson , 90 , 100);
        r.startFight();
    }
}








