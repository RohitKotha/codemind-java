import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=1;j<=n;j++){
       int a,b;
       a=sc.nextInt();
       b=sc.nextInt();
       int t=0;
        for(int i=2;i<=(a+b)/2;i++){
            if((a+b)%i==0){
                
                t=1;
                break;
                
            }
            
        }
        if (t==1)
        System.out.println("Satya");
        else
        System.out.println("tevitt");
}
    }
}
