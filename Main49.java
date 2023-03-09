import java.util.Arrays;

public class Main49 {
    public static void main(String[] args) {
        int[] list={1,25,12,7,8,33,1,17,19,25,7,8,12,33,};
        for (int i = 0 ; i<list.length; i++){
        int counter =0;
        for (int j : list){
            if (list[i] == j){

                    counter++;
                }
            }
            System.out.println(list[i] + " sayısı dizide " + counter + " kadar tekrar ediyor ");
        }
     }
    }

