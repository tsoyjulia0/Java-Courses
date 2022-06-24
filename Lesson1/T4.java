import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class T4 {
    public static boolean Equal(String[] w1, String[] w2) {
        int i1 = 0, j1 = 0, i2 = 0, j2 = 0;

        while(true){
            if(w1[i1].charAt(j1) != w2[i2].charAt(j2)) return false;
            if(j1 == w1[i1].length()-1){i1++; j1 = 0;}
            else j1++;
            if(j2 == w2[i2].length()-1){i2++; j2 = 0;}
            else j2++;
            if(i1 == w1.length && i2 == w2.length)
                return true;
            else if(i1 == w1.length || i2 == w2.length)
                return false;
        }
    }
   public static void main(String args[]) throws java.lang.Exception {
    Scanner n = new Scanner(System.in);
    int nu = n.nextInt();
    String[] arr = new String[nu];
    for(int i = 0; i < nu; i++){
        arr[i] = n.nextLine();
    }
    
    int m = n.nextInt();
    String[] ar = new String[m];
    for(int i = 0; i < m; i++){
        ar[i] = n.nextLine();
    }

    System.out.println(Equal(arr, ar)  ? "true" : "false");
   }
}
