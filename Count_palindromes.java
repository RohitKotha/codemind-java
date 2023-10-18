import java.util.*;
public class rohit{
    static int cont(int n){
        int rev=0;
        int temp=n;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(temp==rev){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            int k=sc.nextInt();
            
            
                c+=cont(k);
            
            
        }
        System.out.println(c);
    }
}