import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        int heat;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sıcaklık giriniz:");
        heat=inp.nextInt();

        if (heat < 5 ) {
            System.out.print("Kayak yapabilirsiniz!");
        }
        if ((heat >= 5) && (heat<=14) ) {
            System.out.print("Sinemaya gidebilirsiniz!");
        }
        if (heat == 15) {
            System.out.print("Sinema veya pikniğe gidebilirsiniz!");
        }
        if ((heat >= 16) && (heat<=25) ) {
            System.out.print("Pikniğe gidebilirsiniz!");
        }
        if (heat>25) {
            System.out.print("Yüzmeye gidebilirsiniz!");
        }


    }
}
