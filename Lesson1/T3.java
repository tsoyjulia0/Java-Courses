import java.util.Scanner;
public class T3 {
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.print("num = ");
        int num = n.nextInt();
        int cnt = 0;

        while(num!=0){
            if(num%2==0){
                num/=2;
                cnt+=1;
            }
            else{
                num-=1;
                cnt+=1;
            }
        
        }
        System.out.println(cnt);
    }
}
