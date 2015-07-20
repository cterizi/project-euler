import java.util.*;
class Problem_10{
 public static void main(String[] args){
  
  long res = findPrimes((long)2000000); 
System.out.println("the sum is = " + res);  
 }
 
 public static long findPrimes(long n){
    long status = 1l;
    long num = 3l;
    long sum =0l;
    if (n >= 1){         
      System.out.println("---------------------");
      sum = sum +2;
      System.out.println(2);
    }
    for ( long count = 2l ; count <=n ;  ){
      for ( long j = 2l ; j <= (long)Math.sqrt(num) ; j++ ){
        if ( num%j == 0 ){
               status = 0;
               break;
        }
      }
      if ( status != 0 ){
            if(num>n){
              break;
            }
            sum = sum + num;
            System.out.println(num);
            count++;
      }
      status = 1l;
      num++;
    }
    return(sum);
  } 
}