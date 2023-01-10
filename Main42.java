public class Main42 {
    public static void main(String[] args) {
        double [][]list=new double[5][4];
        for(int i=0; i<list.length; i++) {
            for (int j = 0; j < 4; j++) {
                list[i][j] = Math.round(Math.random()*100);
            }
        }
            for( int i=0; i<list.length; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(list[i][j] +"\t");
                }
                System.out.println();
            }



    }
}
