import java.util.*;
public class rohit{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        char n=sc.next().charAt(0);
        String k;
        if(n=='a'||n=='A'||n=='e'||n=='E'||n=='i'||n=='I'||n=='o'||n=='O'||n=='u'||n=='U')
        {
          k="Vowel";  
        }else{
            k="Consonant";
        }
        System.out.print(k);
    }
}