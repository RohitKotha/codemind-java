import java.util.*;
public class hero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==1){
            System.out.print(arr[n-1]);
        }
        else{
            n=n-1;
            while(true){
            if(arr[n]%2==0){
               n--; 
            }
            else if(arr[n]%2!=0){
                System.out.print(arr[n]);
                break;
            }
        }
        }
    }
}