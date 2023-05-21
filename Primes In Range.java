import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 0;
           for(int j = a; j <= b; j++){
               if(prime(j)) c++;
           }
           System.out.println(c);
        }
    }


public static boolean prime(int a){
    if(a==1) return false;
    for(int i = 2; i*i<=a; i++){
        if(a%i==0) return false;
    }
    return true;
}
}
