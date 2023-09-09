import java.util.*;
public class ok{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        for(int i=1;i<=n1;i++){
            int n,m;
            int c=0;
            n=sc.nextInt();
            m=sc.nextInt();
            for(int j=n;j<=m;j++){
            if(j<10){
                if(j==2 || j==3 || j==9){
                c++;
                    
                }
            }
            
            else if(j%10==2 || j%10==3 || j%10==9){
                c++;
            }
            
            }
            System.out.println(c);
        }
    }
}