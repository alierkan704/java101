import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner inp=new Scanner(System.in);
     System.out.println("Mayın tarlası oyununa hoşgeldiniz!");
        System.out.println("Oynamak istediğiniz mayın tarlası boyutlarını giriniz!");
        System.out.println("Satır sayısını giriniz:");
        int row=inp.nextInt();
        System.out.println("Sütun sayısını giriniz:");
        int col=inp.nextInt();
        MineSweeper mine=new MineSweeper(row,col);
        mine.run();
    }
}
