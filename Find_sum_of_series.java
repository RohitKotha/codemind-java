import java.util.*;
public class goodgame{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double k=0;
        for(double i=1;i<=n;i++){
            k+=1/i;
        }
        System.out.printf("%.2f",k);
    }
}