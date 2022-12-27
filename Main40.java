import java.util.Scanner;

public class Main40 {
    public static void main(String[] args) {
        int i, s = 0;
        int list[] = new int[10];
        Scanner inp = new Scanner(System.in);

        System.out.println("10 tane sayı girin :");

        for (i = 0; i < list.length; i++) {
            list[i] = inp.nextInt();
        }
        for (int j = 0; j < list.length; j++)
        {
            System.out.print(list[j] + " ");
        }

    }

}