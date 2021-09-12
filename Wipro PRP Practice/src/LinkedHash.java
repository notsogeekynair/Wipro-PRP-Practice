import java.util.*;
import java.io.*;

public class LinkedHash {


        public static void main(String [] args){

            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a string ");
            String s= sc.nextLine();
            System.out.println();
            HashMap<Character,Integer> res= new HashMap<Character,Integer>();

            char[] c= s.toCharArray();
            for(int i=0;i<s.length();i++){
                res.put(c[i],i);
            }
            //Using Linked Hashmaps
            LinkedHashMap<Character,Integer> res2=new LinkedHashMap<Character, Integer>();
            for(int i=0;i<s.length();i++){
                res2.put(c[i],i);
            }
            System.out.println(res);
            System.out.println(res2);
        }
    }

