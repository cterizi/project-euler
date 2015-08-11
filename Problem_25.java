import java.math.BigInteger;
 
class Problem_25{
  
  public static long count = 3l;
    
  public static void main(String[] args){
    BigInteger a1 = BigInteger.ONE;
    BigInteger b1 = BigInteger.ONE;
    fibonacci(a1,b1);
  }
  
  public static void findLenght (String word, BigInteger k, BigInteger l, BigInteger number){
    if(word.length() >= 648){
      System.out.println(count);
      return;
    }
    else {
      count = count + 1;
      fibonacci(l,number);
    }
  }
  
  public static void fibonacci (BigInteger a, BigInteger b) {
    BigInteger number = a.add(b);
    findLenght(number.toString(), a, b, number);
  }
}