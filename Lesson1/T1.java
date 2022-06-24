import java.util.Scanner;
import java.util.Arrays;

public class T1 {
    //Checking
    public static String restoreString(String s, int[] indices) {
        StringBuilder res = new StringBuilder(s);
        for(int i =0; i < indices.length; ++i)
             res.setCharAt(indices[i],s.charAt(i));
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String sent;

        System.out.print("s= ");
        sent = str.nextLine();
        System.out.print(", indeces= ");
        int [] arr = new int[sent.length()];

        for(int i=0;i<sent.length();i++){
            arr[i]=str.nextInt();

        }
        //Call the function
        String ans=  restoreString(sent,arr);
        System.out.println(ans);
      }
  }