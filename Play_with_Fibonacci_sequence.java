import java.util.*;
public class goodgame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a=0,b=1,c=0;
       System.out.print(0 +" "+ 1);
       for(int i=1;i<=n-2;i++){
           c=a+b;
           a=b;
           b=c;
           System.out.print(" "+c);
       }
    }
}