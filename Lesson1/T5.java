import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
 
public class T5{
static int Sum(int[] arr)
{
    int sum = 0;
    int l = arr.length;

    for(int i = 0; i < l; i++)
    {
        for(int j = i; j < l; j += 2)
        {
            for(int k = i; k <= j; k++)
            {
                sum += arr[k];
            }
        }
    }
    return sum;
}

public static void main (String[] args)
{
    Scanner s = new Scanner(System.in);
    int n;
    System.out.println("The size of the array: ");
    n = s.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]= s.nextInt();
    }
  
    System.out.print(Sum(arr));
}
}