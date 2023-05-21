import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String code = "Samsung";
        char cd [] = code.toCharArray();
        int fl = 0;
        String inp = sc.nextLine();
        char in [] = inp.toCharArray();
        for(int i = 0; i < in.length; i++ ){
            if(fl==cd.length) break;
            else if(cd[fl]==in[i]) fl++;
        }
        if(fl==cd.length) System.out.println("SRBD");
        else System.out.println("GHOST");
    }
}
