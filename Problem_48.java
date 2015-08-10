import java.math.BigInteger;
class Problem_48{
  public static void main(String[] args){
    BigInteger sum = BigInteger.ZERO;
    BigInteger finalSum = BigInteger.ZERO;
    BigInteger helpValue = BigInteger.ONE;
    for(int i =1; i<=1000; i++){
      System.out.println(i);
      sum = helpValue.pow(i);
      helpValue = helpValue.add(BigInteger.ONE);
      finalSum = finalSum.add(sum);
    }
    //String tenString = "10000000000";
    //Error: Convert tenString into BigInteger
    //BigInteger ten = finalSum % BigInteger("10000000000");
    System.out.println("The sum is " + finalSum);
    //System.out.println("The last ten digits are " + ten );
    //The result is 9110846700. 
  }
}