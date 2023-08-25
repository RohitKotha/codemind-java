import java.util.Scanner;
public class rohit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0,k=0,l=0,f=0;
        while(n<m){
                f=n;
            while(f!=1){
                c=c+1;
                if(f%2==0){
                    f=f/2;
                }
                else{
                    f=3*f+1;
                }
            }
            if(c>l){
                l=c;
                k=n;
            }
            n++;
            c=0;
          }
        System.out.print(k);
    }
}