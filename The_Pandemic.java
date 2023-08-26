import java.util.Scanner;
public class Electricity{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        if((n-1)<=2){
            System.out.print(n-1);    
        }
        else{
            System.out.print(2);
        }
        
    }
}