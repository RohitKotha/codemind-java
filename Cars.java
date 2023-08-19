import java.util.*;
public class cars{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int c1=c,c2=0,k=0;
        if(a>=b){
            System.out.println("-1");
        }
        else if(a<b){
                while(c1>=c2){
                    c1=c1+a;
                    c2=c2+b;
                    k++;
                }
                System.out.println(k);
        }
        
    }
}