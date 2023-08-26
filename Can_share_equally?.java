import java.util.*;
public class rohit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x==0 &&y%2==0){
            System.out.print("YES");
        }
        else if(x%2==0 && x!=0){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}