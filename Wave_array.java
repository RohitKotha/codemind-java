import java.util.*;
public class rohit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=1;i<n;i++){
          if(arr[0]<arr[1]){
              if(i%2!=0){
                 if( arr[i-1]<arr[i]){
                     c+=1;
                 }
              }
          }   
          else if(arr[0]>arr[1]){
              if(i%2!=0){
                 if( arr[i-1]>arr[i]){
                     c+=1;
                 }
              }
          }
         }
         if(c==(n/2)){
             System.out.print("yes");
         }
         else{
             System.out.print("no");
         }
    }
}