import java.util.*;

public class Exception2 {

    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner inp=new Scanner(System.in);
            int x=inp.nextInt();
            int y=inp.nextInt();
            try{
                System.out.println(x/y);

            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
                System.out.println("Hata yakalandı");
            }




        }
    }


