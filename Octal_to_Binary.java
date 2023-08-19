import java.util.*;
public class rohit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        String st=sc.next();
        int d=Integer.parseInt(st,8);
        String st1=Integer.toString(d,2);
        System.out.println(st1);
        }
    }
    }
