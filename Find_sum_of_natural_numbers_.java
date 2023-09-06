import java.util.*;
public class hero{
    public static void main(String[] williams){
        Scanner sc=new Scanner (System.in);
        int op=0,n=sc.nextInt();
        for(int i=1;i<=n;i++){
            op+=i;
        }
        System.out.print(op);
    }
}