import java.util.Scanner;
public class T2 {
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int rev=0;
        int rem;
        int number = num;
//  Get the reversed number
        while(num!=0){
            rem = num % 10;
            rev = rev*10 + rem;
            num/=10;

        }
// Checking if the number is palindrome or not
        if(number == rev){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
 

    }
}
