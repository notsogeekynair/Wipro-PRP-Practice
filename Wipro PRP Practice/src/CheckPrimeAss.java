import java.util.*;
import java.io.*;

import static java.lang.System.out;

public class CheckPrimeAss {

    public static boolean isPrime(int n) {

        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count += 1;
        }
        if(count==2)
            return true;
        else
            return false;
    }
    public static String checkPrimeAss(String input1) {
        int pa,i = 0;
        int len=input1.length();
        int count = 0;
        int primesum = 0;
        String f=new String();
        String x=new String();
        for ( i = 0; i < len; i++) {
            pa = input1.codePointAt(i);
            if(isPrime(pa)){
                primesum=primesum+pa;
                f=f+input1.charAt(i);
            }
        }
        if(primesum==0){
            x=x+input1.charAt(0);
            i=1;
            while(i < input1.length()-1){
                x=x+"_";
                i++;
            }
            x=x+input1.charAt(len-1);
            //System.out.println(x);
            return x;

        }
        else
            return f + ":" + primesum;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String x=sc.nextLine();
        System.out.println(checkPrimeAss(x));
    }
}
