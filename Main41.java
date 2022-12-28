import java.util.Scanner;

public class Main41 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int [][]dizi = new int[3][3];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("[" + i + "]" + "["+ j +"] = ");
                dizi[i][j] = inp.nextInt();
            }
        }

        System.out.println("\n");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(dizi[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }

}
