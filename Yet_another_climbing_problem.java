import java.util.*;
public class rohit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println(x/y+x%y);
        }
    }
}