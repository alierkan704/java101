public class Main43 {
    public static void main(String[] args) {
        int[] list= {2,4,8,7,9};
        double sum=0.0;
        for(int i=0; i<list.length; i++){
            sum+=1.0/list[i];
        }
        System.out.println();
        double avarage=sum/list.length;
        System.out.print("Harmonik seri ortalaması:"+avarage);
    }
}
