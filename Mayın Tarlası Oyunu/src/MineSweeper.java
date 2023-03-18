
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber, colNumber, size;
    String[][] map;
   int[][] board;
   boolean game=true;
    Scanner inp = new Scanner(System.in);
    Random rand = new Random();

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new String[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size=rowNumber*colNumber;
    }
    public void run(){
        prepareGame();
        print(map);
        System.out.println("Oyun başladı!");
        play();

    }
    public void  play(){
        int succes=0;
        while(game){
        System.out.println("Açmak istediğiniz kutucuğun hangi satırda olduğunu giriniz:");
        int row= inp.nextInt();
        System.out.println("Açmak istediğiniz kutucuğun hangi sütunda olduğunu giriniz:");
        int col= inp.nextInt();
        if(col>=0&&row>=0&&col<=colNumber&&row<=rowNumber) {

            if (map[row][col] == "*") {
                System.out.println("Game over!");
                game = false;
            }
            if (map[row][col] != "*") {
                int mineCount = 0;
                int a = 0;
                int b = 0;
                int c = 0;
                int d = 0;
                int e = 0;
                int f = 0;
                int g = 0;
                int h = 0;
                if (row + 1 < rowNumber && map[row + 1][col] == "*") {
                    a++;
                } else
                    a = 0;

                if (col + 1 < colNumber && map[row][col + 1] == "*") {
                    b++;
                } else
                    b = 0;
                if (col - 1 >= 0 && map[row][col - 1] == "*") {
                    c++;
                } else
                    c = 0;
                if (row - 1 >= 0 && map[row - 1][col] == "*") {
                    d++;
                } else
                    d = 0;
                if (col - 1 >= 0 && row + 1 < rowNumber && map[row + 1][col - 1] == "*") {
                    e++;
                } else
                    e = 0;
                if (col + 1 < colNumber && row + 1 < rowNumber && map[row + 1][col + 1] == "*") {
                    f++;
                } else
                    f = 0;
                if (col - 1 >= 0 && row - 1 >= 0 && map[row - 1][col - 1] == "*") {
                    g++;
                } else
                    g = 0;
                if (col + 1 < colNumber && row - 1 >= 0 && map[row - 1][col + 1] == "*") {
                    h++;
                } else
                    h = 0;

                mineCount = a + b + c + d + e + f + g + h;
                board[row][col] = mineCount;
                print2(board);
                succes++;
                if (succes == (size - (size / 4))) {
                    System.out.println("Kazandınız!");
                    System.out.println("Mayınların yerleri aşağıda * ile gösterilmiştir!");
                    print(map);
                    break;
                }

            }
        }else {
            System.out.println("Hatalı giriş yaptınız!Lütfen tekrar deneyiniz");
        play();
        break;
        }

        }

    }

    public void prepareGame(){
        int randRow,randCol;
        int count=1;
      for(int i=0; i<map.length; i++){
         for(int j=0; j<map[i].length; j++){
             map[i][j]="-";
         }
      }
        while(count<=(size/4)){
            randRow=rand.nextInt(rowNumber);
            randCol=rand.nextInt(colNumber);
            if(map[randRow][randCol]!="*"){
                map[randRow][randCol]="*" ;
                count++;
            }
        }
    }
    public void print(String [][] arr){
        for (int i=0; i< arr.length; i++){
         for(int j=0; j<arr[0].length; j++) {
             System.out.print(arr[i][j] +" ");
          }
            System.out.println();
        }
    }
    public void print2(int [][] arr){
        for (int i=0; i< arr.length; i++){
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}

