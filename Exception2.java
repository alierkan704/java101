import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner inp=new Scanner(System.in);
   try{
    int x=inp.nextInt();
    int y=inp.nextInt();

        System.out.println(x/y);
    
    }       catch(ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException: / by zero");
    
    } catch(InputMismatchException ime) {
            System.out.println("java.util.InputMismatchException");
        
        
        
        
    }
}
}
