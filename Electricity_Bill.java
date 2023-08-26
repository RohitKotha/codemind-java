import java.util.Scanner;
public class Electricity{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String id=sc.nextLine();
        String name=sc.nextLine();
        Double n=sc.nextDouble();
        Double s=0.00,sur;
	Double ts;
        if(n<200){
            s=1.20*n;
        }
        else if(n>=200 && n<400){
            s=1.50*n;
        }
        else if(n>=400 && n<600){
            s=1.80*n;
        }
        else{
            s=2.00*n;
        }
        if(s>400){
            ts=s+(s*0.15);
        }
	else{
		ts=s+100;
	}
        System.out.printf("%.2f",ts);
    }
}