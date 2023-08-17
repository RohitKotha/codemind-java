import java.util.*;
public class rohit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int r1,r2,r3;
            r1=sc.nextInt();
            r2=sc.nextInt();
            r3=sc.nextInt();
            if (r1>r2+r3 || r2>r1+r3 || r3>r1+r2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}