import java.util.Random;

public class Snake extends Obstacle{
    public static int randomDamage(){
        Random r=new Random();
        return r.nextInt(10)+1;
    }
    public static int randomGold(){
        Random r=new Random();
        return r.nextInt(20)+1;
    }


    public Snake() {

        super(4, "Yılan",randomDamage() , 12, randomGold());
    }



}

