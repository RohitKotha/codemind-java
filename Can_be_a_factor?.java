import java.util.*;
public class rohit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        for(long i=1;i<=n;i++){
            long x,y,c=0;
            x=sc.nextInt();
            y=sc.nextInt();
            
            for(long j=0;j<=1000;j++){
                if((y)%(x)==0){
                    System.out.println("YES");
                    c++;
                    break;
                }
            
            else{
                long w=y%x;
                y=y+w;
                x=x+w;
            }
            
        }
            if(c==0){
                System.out.println("NO");
            }
        }
        }
}
