import java.util.Scanner;
public class Main52 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Matrisinizin satır sayısını giriniz:");
        int a=inp.nextInt();
        System.out.println("Matrisinizin sütun sayısını giriniz:");
        int b=inp.nextInt();
        int [][] list= new int[a][b];
        int [][] tList= new int[b][a];
        for(int i=0; i<a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println((i+1) + ". Satır " + (j+1) + ". Sutünun elamanını giriniz.");
                int c = inp.nextInt();
                list[i][j] = c;
                tList[j][i] = c;
            }
        }
        System.out.println("Matris : ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(list[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transpoze : ");
        for (int j = 0; j < b; j++) {
            for (int i = 0; i < a; i++) {
                System.out.print(tList[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
