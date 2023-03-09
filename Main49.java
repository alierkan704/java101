import java.util.Arrays;

public class Main49 {
    public static void main(String[] args) {
        int[] list={1,25,12,7,8,33,1,17,19,25,7,8,12,33,};
        for (int i = 0 ; i<list.length; i++){
        int counter =0;
        for (int j : list){
            if (list[i] == j){
                if(j < i){
                    break;
                }
                counter++;
                }
            }
            if(counter > 0){
                //System.out.println(arr[i]+" sayisi "+ count + " kere yazilmistir.");
                System.out.printf("%d sayisi %d kere yazilmistir.\n", list[i], counter);
                counter = 0;
            }
        }
     }
    }

