import java.util.Arrays;

public class Main46 {
    public static void main(String[] args) {
        int[] list={1,25,12,7,8,33,1,17,19,25,7,8,12};
        int[] duplicate= new int[list.length];
        int startIndex=0;
        for(int i=0; i<list.length; i++){
            for(int j=0; j<list.length; j++){
                if(i!=j &&list[i]==list[j]&&list[i]%2==0){
                    duplicate[startIndex++]=list[j];
                    break;
                }

            }
        }
    System.out.print(Arrays.toString(duplicate));
    }
}
