import java.util.*;
class Problem_7{
  public static void main(String[] args){
    int n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of prime numbers you want");
    n = in.nextInt();
    findPrimes(n);  
  }
  
  public static void findPrimes(int n){
    int status = 1;
    int num = 3;
    if (n >= 1){         
      System.out.println("---------------------");
      System.out.println(2);
    }
    for ( int count = 2 ; count <=n ;  ){
      for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ){
        if ( num%j == 0 ){
               status = 0;
               break;
        }
      }
      if ( status != 0 ){
            System.out.println(num);
            count++;
      }
      status = 1;
      num++;
    }
  } 
}