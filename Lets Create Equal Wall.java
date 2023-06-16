import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt ();
    int b = sc.nextInt();
    int c = sc.nextInt(); 
    int ar1 [] = new int [a];
    int ar2 [] = new int [b];
    int ar3 [] = new int [c];
    
    for(int i = 0; i < a; i++) ar1[i]=sc.nextInt();
    for(int i = 0; i < b; i++) ar2[i]=sc.nextInt();
    for(int i = 0; i < c; i++) ar3[i]=sc.nextInt();
    ar1 = Sum(ar1);
    ar2 = Sum(ar2);
    ar3 = Sum(ar3);
    int max=0;
    for(int i = 0; i < ar1.length; i++){
        if(find(ar2,ar1[i])&&find(ar3,ar1[i])) max = ar1[i];
    }
    System.out.println(max);
  }
  
  public static int [] Sum (int ar []){
      int ar1 [] = new int [ar.length];
      ar1[0]=ar[ar.length-1];
      int j = 1;
     for(int i = ar.length-2; i >= 0; i--){
         ar1[j]=ar1[j-1]+ar[i];
         j++;
     }
     return ar1;
  }
  public static boolean find(int ar[], int k){
      for(int i = 0; i < ar.length; i++){
          if(ar[i]==k) return true;
      }
      return false;
  }
}
