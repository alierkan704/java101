public class Main30 {
    public static void main(String[] args) {
        int n=100;
        for(int k=1; k<10; k++){
            if(k==2||k==3||k==5||k==7) {
                System.out.println(k);
            }
        }

        for(int i=10; i<=n; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {

            } else {
                System.out.println(i);
            }
        }

    }
}
